/*     */ import java.io.BufferedInputStream;
/*     */ import java.io.ByteArrayInputStream;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.RandomAccessFile;
/*     */ import java.util.ArrayList;
/*     */ import java.util.zip.DeflaterOutputStream;
/*     */ import java.util.zip.GZIPInputStream;
/*     */ import java.util.zip.InflaterInputStream;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aqh
/*     */ {
/*  76 */   private static final byte[] a = new byte['က'];
/*     */   private final File b;
/*     */   private RandomAccessFile c;
/*     */   private final int[] d;
/*     */   private final int[] e;
/*     */   private ArrayList f;
/*     */   private int g;
/*     */   private long h;
/*     */   
/*     */   public aqh(File paramFile)
/*     */   {
/*  87 */     this.d = new int['Ѐ'];
/*  88 */     this.e = new int['Ѐ'];
/*     */     
/*  90 */     this.b = paramFile;
/*     */     
/*  92 */     this.g = 0;
/*     */     try
/*     */     {
/*  95 */       if (paramFile.exists()) {
/*  96 */         this.h = paramFile.lastModified();
/*     */       }
/*     */       
/*  99 */       this.c = new RandomAccessFile(paramFile, "rw");
/*     */       
/* 101 */       if (this.c.length() < 4096L)
/*     */       {
/* 103 */         for (i = 0; i < 1024; i++) {
/* 104 */           this.c.writeInt(0);
/*     */         }
/*     */         
/* 107 */         for (i = 0; i < 1024; i++) {
/* 108 */           this.c.writeInt(0);
/*     */         }
/*     */         
/* 111 */         this.g += 8192;
/*     */       }
/*     */       
/* 114 */       if ((this.c.length() & 0xFFF) != 0L)
/*     */       {
/* 116 */         for (i = 0; i < (this.c.length() & 0xFFF); i++) {
/* 117 */           this.c.write(0);
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 122 */       int i = (int)this.c.length() / 4096;
/* 123 */       this.f = new ArrayList(i);
/*     */       
/* 125 */       for (int j = 0; j < i; j++) {
/* 126 */         this.f.add(Boolean.valueOf(true));
/*     */       }
/*     */       
/* 129 */       this.f.set(0, Boolean.valueOf(false));
/* 130 */       this.f.set(1, Boolean.valueOf(false));
/*     */       
/* 132 */       this.c.seek(0L);
/* 133 */       int k; for (j = 0; j < 1024; j++) {
/* 134 */         k = this.c.readInt();
/* 135 */         this.d[j] = k;
/* 136 */         if ((k != 0) && ((k >> 8) + (k & 0xFF) <= this.f.size())) {
/* 137 */           for (int m = 0; m < (k & 0xFF); m++) {
/* 138 */             this.f.set((k >> 8) + m, Boolean.valueOf(false));
/*     */           }
/*     */         }
/*     */       }
/* 142 */       for (j = 0; j < 1024; j++) {
/* 143 */         k = this.c.readInt();
/* 144 */         this.e[j] = k;
/*     */       }
/*     */     } catch (IOException localIOException) {
/* 147 */       localIOException.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized DataInputStream a(int paramInt1, int paramInt2)
/*     */   {
/* 168 */     if (d(paramInt1, paramInt2)) {
/* 169 */       return null;
/*     */     }
/*     */     try
/*     */     {
/* 173 */       int i = e(paramInt1, paramInt2);
/* 174 */       if (i == 0) {
/* 175 */         return null;
/*     */       }
/*     */       
/* 178 */       int j = i >> 8;
/* 179 */       int k = i & 0xFF;
/*     */       
/* 181 */       if (j + k > this.f.size()) {
/* 182 */         return null;
/*     */       }
/*     */       
/* 185 */       this.c.seek(j * 4096);
/* 186 */       int m = this.c.readInt();
/*     */       
/* 188 */       if (m > 4096 * k)
/* 189 */         return null;
/* 190 */       if (m <= 0) {
/* 191 */         return null;
/*     */       }
/*     */       
/* 194 */       int n = this.c.readByte();
/* 195 */       byte[] arrayOfByte; if (n == 1) {
/* 196 */         arrayOfByte = new byte[m - 1];
/* 197 */         this.c.read(arrayOfByte);
/* 198 */         return new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(arrayOfByte)))); }
/* 199 */       if (n == 2) {
/* 200 */         arrayOfByte = new byte[m - 1];
/* 201 */         this.c.read(arrayOfByte);
/* 202 */         return new DataInputStream(new BufferedInputStream(new InflaterInputStream(new ByteArrayInputStream(arrayOfByte))));
/*     */       }
/*     */       
/* 205 */       return null;
/*     */     } catch (IOException localIOException) {}
/* 207 */     return null;
/*     */   }
/*     */   
/*     */   public DataOutputStream b(int paramInt1, int paramInt2)
/*     */   {
/* 212 */     if (d(paramInt1, paramInt2)) { return null;
/*     */     }
/* 214 */     return new DataOutputStream(new DeflaterOutputStream(new aqi(this, paramInt1, paramInt2)));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected synchronized void a(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3)
/*     */   {
/*     */     try
/*     */     {
/* 239 */       int i = e(paramInt1, paramInt2);
/* 240 */       int j = i >> 8;
/* 241 */       int k = i & 0xFF;
/* 242 */       int m = (paramInt3 + 5) / 4096 + 1;
/*     */       
/*     */ 
/* 245 */       if (m >= 256) {
/* 246 */         return;
/*     */       }
/*     */       
/* 249 */       if ((j != 0) && (k == m))
/*     */       {
/* 251 */         a(j, paramArrayOfByte, paramInt3);
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/* 256 */         for (int n = 0; n < k; n++) {
/* 257 */           this.f.set(j + n, Boolean.valueOf(true));
/*     */         }
/*     */         
/*     */ 
/* 261 */         n = this.f.indexOf(Boolean.valueOf(true));
/* 262 */         int i1 = 0;
/* 263 */         int i2; if (n != -1) {
/* 264 */           for (i2 = n; i2 < this.f.size(); i2++) {
/* 265 */             if (i1 != 0) {
/* 266 */               if (((Boolean)this.f.get(i2)).booleanValue()) i1++; else
/* 267 */                 i1 = 0;
/* 268 */             } else if (((Boolean)this.f.get(i2)).booleanValue()) {
/* 269 */               n = i2;
/* 270 */               i1 = 1;
/*     */             }
/* 272 */             if (i1 >= m) {
/*     */               break;
/*     */             }
/*     */           }
/*     */         }
/*     */         
/* 278 */         if (i1 >= m)
/*     */         {
/* 280 */           j = n;
/* 281 */           a(paramInt1, paramInt2, j << 8 | m);
/* 282 */           for (i2 = 0; i2 < m; i2++) {
/* 283 */             this.f.set(j + i2, Boolean.valueOf(false));
/*     */           }
/* 285 */           a(j, paramArrayOfByte, paramInt3);
/*     */         }
/*     */         else {
/* 288 */           this.c.seek(this.c.length());
/* 289 */           j = this.f.size();
/* 290 */           for (i2 = 0; i2 < m; i2++) {
/* 291 */             this.c.write(a);
/* 292 */             this.f.add(Boolean.valueOf(false));
/*     */           }
/* 294 */           this.g += 4096 * m;
/*     */           
/* 296 */           a(j, paramArrayOfByte, paramInt3);
/* 297 */           a(paramInt1, paramInt2, j << 8 | m);
/*     */         }
/*     */       }
/* 300 */       b(paramInt1, paramInt2, (int)(MinecraftServer.ar() / 1000L));
/*     */     } catch (IOException localIOException) {
/* 302 */       localIOException.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
/*     */   {
/* 308 */     this.c.seek(paramInt1 * 4096);
/* 309 */     this.c.writeInt(paramInt2 + 1);
/* 310 */     this.c.writeByte(2);
/* 311 */     this.c.write(paramArrayOfByte, 0, paramInt2);
/*     */   }
/*     */   
/*     */   private boolean d(int paramInt1, int paramInt2)
/*     */   {
/* 316 */     return (paramInt1 < 0) || (paramInt1 >= 32) || (paramInt2 < 0) || (paramInt2 >= 32);
/*     */   }
/*     */   
/*     */   private int e(int paramInt1, int paramInt2) {
/* 320 */     return this.d[(paramInt1 + paramInt2 * 32)];
/*     */   }
/*     */   
/*     */   public boolean c(int paramInt1, int paramInt2) {
/* 324 */     return e(paramInt1, paramInt2) != 0;
/*     */   }
/*     */   
/*     */   private void a(int paramInt1, int paramInt2, int paramInt3) {
/* 328 */     this.d[(paramInt1 + paramInt2 * 32)] = paramInt3;
/* 329 */     this.c.seek((paramInt1 + paramInt2 * 32) * 4);
/* 330 */     this.c.writeInt(paramInt3);
/*     */   }
/*     */   
/*     */   private void b(int paramInt1, int paramInt2, int paramInt3) {
/* 334 */     this.e[(paramInt1 + paramInt2 * 32)] = paramInt3;
/* 335 */     this.c.seek(4096 + (paramInt1 + paramInt2 * 32) * 4);
/* 336 */     this.c.writeInt(paramInt3);
/*     */   }
/*     */   
/*     */   public void c() {
/* 340 */     if (this.c != null) this.c.close();
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aqh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */