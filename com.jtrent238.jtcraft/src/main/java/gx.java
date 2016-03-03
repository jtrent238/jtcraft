/*     */ import java.io.IOException;
/*     */ import java.util.zip.DataFormatException;
/*     */ import java.util.zip.Deflater;
/*     */ import java.util.zip.Inflater;
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
/*     */ public class gx
/*     */   extends ft
/*     */ {
/*     */   private int a;
/*     */   private int b;
/*     */   private int c;
/*     */   private int d;
/*     */   private byte[] e;
/*     */   private byte[] f;
/*     */   private boolean g;
/*     */   private int h;
/*  27 */   private static byte[] i = new byte[196864];
/*     */   
/*     */ 
/*     */   public gx() {}
/*     */   
/*     */   public gx(apx paramapx, boolean paramBoolean, int paramInt)
/*     */   {
/*  34 */     this.a = paramapx.g;
/*  35 */     this.b = paramapx.h;
/*  36 */     this.g = paramBoolean;
/*     */     
/*  38 */     gy localgy = a(paramapx, paramBoolean, paramInt);
/*  39 */     Deflater localDeflater = new Deflater(-1);
/*  40 */     this.d = localgy.c;
/*  41 */     this.c = localgy.b;
/*     */     try
/*     */     {
/*  44 */       this.f = localgy.a;
/*  45 */       localDeflater.setInput(localgy.a, 0, localgy.a.length);
/*  46 */       localDeflater.finish();
/*  47 */       this.e = new byte[localgy.a.length];
/*  48 */       this.h = localDeflater.deflate(this.e);
/*     */     } finally {
/*  50 */       localDeflater.end();
/*     */     }
/*     */   }
/*     */   
/*     */   public static int c() {
/*  55 */     return 196864;
/*     */   }
/*     */   
/*     */   public void a(et paramet)
/*     */   {
/*  60 */     this.a = paramet.readInt();
/*  61 */     this.b = paramet.readInt();
/*  62 */     this.g = paramet.readBoolean();
/*  63 */     this.c = paramet.readShort();
/*  64 */     this.d = paramet.readShort();
/*     */     
/*  66 */     this.h = paramet.readInt();
/*  67 */     if (i.length < this.h) {
/*  68 */       i = new byte[this.h];
/*     */     }
/*  70 */     paramet.readBytes(i, 0, this.h);
/*     */     
/*  72 */     int j = 0;
/*  73 */     for (int k = 0; k < 16; k++) {
/*  74 */       j += (this.c >> k & 0x1);
/*     */     }
/*  76 */     k = 12288 * j;
/*  77 */     if (this.g) {
/*  78 */       k += 256;
/*     */     }
/*     */     
/*  81 */     this.f = new byte[k];
/*     */     
/*  83 */     Inflater localInflater = new Inflater();
/*  84 */     localInflater.setInput(i, 0, this.h);
/*     */     try {
/*  86 */       localInflater.inflate(this.f);
/*     */     } catch (DataFormatException localDataFormatException) {
/*  88 */       throw new IOException("Bad compressed data format");
/*     */     } finally {
/*  90 */       localInflater.end();
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(et paramet)
/*     */   {
/*  96 */     paramet.writeInt(this.a);
/*  97 */     paramet.writeInt(this.b);
/*  98 */     paramet.writeBoolean(this.g);
/*  99 */     paramet.writeShort((short)(this.c & 0xFFFF));
/* 100 */     paramet.writeShort((short)(this.d & 0xFFFF));
/*     */     
/* 102 */     paramet.writeInt(this.h);
/* 103 */     paramet.writeBytes(this.e, 0, this.h);
/*     */   }
/*     */   
/*     */   public void a(fv paramfv)
/*     */   {
/* 108 */     paramfv.a(this);
/*     */   }
/*     */   
/*     */   public String b()
/*     */   {
/* 113 */     return String.format("x=%d, z=%d, full=%b, sects=%d, add=%d, size=%d", new Object[] { Integer.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.g), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.h) });
/*     */   }
/*     */   
/*     */   public byte[] d() {
/* 117 */     return this.f;
/*     */   }
/*     */   
/*     */   public static gy a(apx paramapx, boolean paramBoolean, int paramInt) {
/* 121 */     int j = 0;
/* 122 */     apz[] arrayOfapz = paramapx.i();
/* 123 */     int k = 0;
/* 124 */     gy localgy = new gy();
/* 125 */     byte[] arrayOfByte1 = i;
/*     */     
/* 127 */     if (paramBoolean) {
/* 128 */       paramapx.q = true;
/*     */     }
/*     */     
/* 131 */     for (int m = 0; m < arrayOfapz.length; m++) {
/* 132 */       if ((arrayOfapz[m] != null) && ((!paramBoolean) || (!arrayOfapz[m].a())) && ((paramInt & 1 << m) != 0)) {
/* 133 */         localgy.b |= 1 << m;
/*     */         
/* 135 */         if (arrayOfapz[m].i() != null) {
/* 136 */           localgy.c |= 1 << m;
/* 137 */           k++;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */     Object localObject;
/*     */     
/* 144 */     for (m = 0; m < arrayOfapz.length; m++) {
/* 145 */       if ((arrayOfapz[m] != null) && ((!paramBoolean) || (!arrayOfapz[m].a())) && ((paramInt & 1 << m) != 0)) {
/* 146 */         localObject = arrayOfapz[m].g();
/* 147 */         System.arraycopy(localObject, 0, arrayOfByte1, j, localObject.length);
/* 148 */         j += localObject.length;
/*     */       }
/*     */     }
/* 151 */     for (m = 0; m < arrayOfapz.length; m++) {
/* 152 */       if ((arrayOfapz[m] != null) && ((!paramBoolean) || (!arrayOfapz[m].a())) && ((paramInt & 1 << m) != 0)) {
/* 153 */         localObject = arrayOfapz[m].j();
/* 154 */         System.arraycopy(((apv)localObject).a, 0, arrayOfByte1, j, ((apv)localObject).a.length);
/* 155 */         j += ((apv)localObject).a.length;
/*     */       }
/*     */     }
/* 158 */     for (m = 0; m < arrayOfapz.length; m++) {
/* 159 */       if ((arrayOfapz[m] != null) && ((!paramBoolean) || (!arrayOfapz[m].a())) && ((paramInt & 1 << m) != 0)) {
/* 160 */         localObject = arrayOfapz[m].k();
/* 161 */         System.arraycopy(((apv)localObject).a, 0, arrayOfByte1, j, ((apv)localObject).a.length);
/* 162 */         j += ((apv)localObject).a.length;
/*     */       }
/*     */     }
/* 165 */     if (!paramapx.e.t.g) {
/* 166 */       for (m = 0; m < arrayOfapz.length; m++) {
/* 167 */         if ((arrayOfapz[m] != null) && ((!paramBoolean) || (!arrayOfapz[m].a())) && ((paramInt & 1 << m) != 0)) {
/* 168 */           localObject = arrayOfapz[m].l();
/* 169 */           System.arraycopy(((apv)localObject).a, 0, arrayOfByte1, j, ((apv)localObject).a.length);
/* 170 */           j += ((apv)localObject).a.length;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 175 */     if (k > 0) {
/* 176 */       for (m = 0; m < arrayOfapz.length; m++) {
/* 177 */         if ((arrayOfapz[m] != null) && ((!paramBoolean) || (!arrayOfapz[m].a())) && (arrayOfapz[m].i() != null) && ((paramInt & 1 << m) != 0)) {
/* 178 */           localObject = arrayOfapz[m].i();
/* 179 */           System.arraycopy(((apv)localObject).a, 0, arrayOfByte1, j, ((apv)localObject).a.length);
/* 180 */           j += ((apv)localObject).a.length;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 185 */     if (paramBoolean) {
/* 186 */       byte[] arrayOfByte2 = paramapx.m();
/* 187 */       System.arraycopy(arrayOfByte2, 0, arrayOfByte1, j, arrayOfByte2.length);
/* 188 */       j += arrayOfByte2.length;
/*     */     }
/*     */     
/* 191 */     localgy.a = new byte[j];
/* 192 */     System.arraycopy(arrayOfByte1, 0, localgy.a, 0, j);
/*     */     
/* 194 */     return localgy;
/*     */   }
/*     */   
/*     */   public int e() {
/* 198 */     return this.a;
/*     */   }
/*     */   
/*     */   public int f() {
/* 202 */     return this.b;
/*     */   }
/*     */   
/*     */   public int g() {
/* 206 */     return this.c;
/*     */   }
/*     */   
/*     */   public int h() {
/* 210 */     return this.d;
/*     */   }
/*     */   
/*     */   public boolean i() {
/* 214 */     return this.g;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\gx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */