/*     */ import java.io.IOException;
/*     */ import java.util.List;
/*     */ import java.util.zip.DataFormatException;
/*     */ import java.util.zip.Deflater;
/*     */ import java.util.zip.Inflater;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class gz
/*     */   extends ft
/*     */ {
/*     */   private int[] a;
/*     */   private int[] b;
/*     */   private int[] c;
/*     */   private int[] d;
/*     */   private byte[] e;
/*     */   private byte[][] f;
/*     */   private int g;
/*     */   private boolean h;
/*  23 */   private static byte[] i = new byte[0];
/*     */   
/*     */ 
/*     */   public gz() {}
/*     */   
/*     */ 
/*     */   public gz(List paramList)
/*     */   {
/*  31 */     int j = paramList.size();
/*     */     
/*  33 */     this.a = new int[j];
/*  34 */     this.b = new int[j];
/*  35 */     this.c = new int[j];
/*  36 */     this.d = new int[j];
/*  37 */     this.f = new byte[j][];
/*  38 */     this.h = ((!paramList.isEmpty()) && (!((apx)paramList.get(0)).e.t.g));
/*     */     
/*  40 */     int k = 0;
/*     */     
/*  42 */     for (int m = 0; m < j; m++) {
/*  43 */       apx localapx = (apx)paramList.get(m);
/*  44 */       gy localgy = gx.a(localapx, true, 65535);
/*     */       
/*  46 */       if (i.length < k + localgy.a.length) {
/*  47 */         byte[] arrayOfByte = new byte[k + localgy.a.length];
/*  48 */         System.arraycopy(i, 0, arrayOfByte, 0, i.length);
/*  49 */         i = arrayOfByte;
/*     */       }
/*     */       
/*  52 */       System.arraycopy(localgy.a, 0, i, k, localgy.a.length);
/*  53 */       k += localgy.a.length;
/*     */       
/*  55 */       this.a[m] = localapx.g;
/*  56 */       this.b[m] = localapx.h;
/*  57 */       this.c[m] = localgy.b;
/*  58 */       this.d[m] = localgy.c;
/*  59 */       this.f[m] = localgy.a;
/*     */     }
/*     */     
/*  62 */     Deflater localDeflater = new Deflater(-1);
/*     */     try
/*     */     {
/*  65 */       localDeflater.setInput(i, 0, k);
/*  66 */       localDeflater.finish();
/*  67 */       this.e = new byte[k];
/*  68 */       this.g = localDeflater.deflate(this.e);
/*     */     } finally {
/*  70 */       localDeflater.end();
/*     */     }
/*     */   }
/*     */   
/*     */   public static int c() {
/*  75 */     return 5;
/*     */   }
/*     */   
/*     */   public void a(et paramet)
/*     */   {
/*  80 */     int j = paramet.readShort();
/*  81 */     this.g = paramet.readInt();
/*  82 */     this.h = paramet.readBoolean();
/*     */     
/*  84 */     this.a = new int[j];
/*  85 */     this.b = new int[j];
/*  86 */     this.c = new int[j];
/*  87 */     this.d = new int[j];
/*  88 */     this.f = new byte[j][];
/*     */     
/*  90 */     if (i.length < this.g) {
/*  91 */       i = new byte[this.g];
/*     */     }
/*  93 */     paramet.readBytes(i, 0, this.g);
/*     */     
/*  95 */     byte[] arrayOfByte = new byte[gx.c() * j];
/*     */     
/*  97 */     Inflater localInflater = new Inflater();
/*  98 */     localInflater.setInput(i, 0, this.g);
/*     */     try {
/* 100 */       localInflater.inflate(arrayOfByte);
/*     */     } catch (DataFormatException localDataFormatException) {
/* 102 */       throw new IOException("Bad compressed data format");
/*     */     } finally {
/* 104 */       localInflater.end();
/*     */     }
/*     */     
/* 107 */     int k = 0;
/* 108 */     for (int m = 0; m < j; m++) {
/* 109 */       this.a[m] = paramet.readInt();
/* 110 */       this.b[m] = paramet.readInt();
/* 111 */       this.c[m] = paramet.readShort();
/* 112 */       this.d[m] = paramet.readShort();
/*     */       
/* 114 */       int n = 0;
/* 115 */       int i1 = 0;
/* 116 */       for (int i2 = 0; i2 < 16; i2++) {
/* 117 */         n += (this.c[m] >> i2 & 0x1);
/* 118 */         i1 += (this.d[m] >> i2 & 0x1);
/*     */       }
/*     */       
/* 121 */       i2 = 2048 * (4 * n) + 256;
/* 122 */       i2 += 2048 * i1;
/* 123 */       if (this.h) {
/* 124 */         i2 += 2048 * n;
/*     */       }
/*     */       
/* 127 */       this.f[m] = new byte[i2];
/* 128 */       System.arraycopy(arrayOfByte, k, this.f[m], 0, i2);
/* 129 */       k += i2;
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(et paramet)
/*     */   {
/* 135 */     paramet.writeShort(this.a.length);
/* 136 */     paramet.writeInt(this.g);
/* 137 */     paramet.writeBoolean(this.h);
/* 138 */     paramet.writeBytes(this.e, 0, this.g);
/*     */     
/* 140 */     for (int j = 0; j < this.a.length; j++) {
/* 141 */       paramet.writeInt(this.a[j]);
/* 142 */       paramet.writeInt(this.b[j]);
/* 143 */       paramet.writeShort((short)(this.c[j] & 0xFFFF));
/* 144 */       paramet.writeShort((short)(this.d[j] & 0xFFFF));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(fv paramfv)
/*     */   {
/* 150 */     paramfv.a(this);
/*     */   }
/*     */   
/*     */   public int a(int paramInt) {
/* 154 */     return this.a[paramInt];
/*     */   }
/*     */   
/*     */   public int b(int paramInt) {
/* 158 */     return this.b[paramInt];
/*     */   }
/*     */   
/*     */   public int d() {
/* 162 */     return this.a.length;
/*     */   }
/*     */   
/*     */   public byte[] c(int paramInt) {
/* 166 */     return this.f[paramInt];
/*     */   }
/*     */   
/*     */   public String b()
/*     */   {
/* 171 */     StringBuilder localStringBuilder = new StringBuilder();
/*     */     
/* 173 */     for (int j = 0; j < this.a.length; j++) {
/* 174 */       if (j > 0) localStringBuilder.append(", ");
/* 175 */       localStringBuilder.append(String.format("{x=%d, z=%d, sections=%d, adds=%d, data=%d}", new Object[] { Integer.valueOf(this.a[j]), Integer.valueOf(this.b[j]), Integer.valueOf(this.c[j]), Integer.valueOf(this.d[j]), Integer.valueOf(this.f[j].length) }));
/*     */     }
/*     */     
/* 178 */     return String.format("size=%d, chunks=%d[%s]", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.a.length), localStringBuilder });
/*     */   }
/*     */   
/*     */   public int[] e() {
/* 182 */     return this.c;
/*     */   }
/*     */   
/*     */   public int[] f() {
/* 186 */     return this.d;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\gz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */