/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class apz
/*     */ {
/*     */   private int a;
/*     */   private int b;
/*     */   private int c;
/*     */   private byte[] d;
/*     */   private apv e;
/*     */   private apv f;
/*     */   private apv g;
/*     */   private apv h;
/*     */   
/*     */   public apz(int paramInt, boolean paramBoolean)
/*     */   {
/*  23 */     this.a = paramInt;
/*  24 */     this.d = new byte['က'];
/*  25 */     this.f = new apv(this.d.length, 4);
/*  26 */     this.g = new apv(this.d.length, 4);
/*  27 */     if (paramBoolean) {
/*  28 */       this.h = new apv(this.d.length, 4);
/*     */     }
/*     */   }
/*     */   
/*     */   public aji a(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  34 */     int i = this.d[(paramInt2 << 8 | paramInt3 << 4 | paramInt1)] & 0xFF;
/*  35 */     if (this.e != null) {
/*  36 */       i = this.e.a(paramInt1, paramInt2, paramInt3) << 8 | i;
/*     */     }
/*  38 */     return aji.e(i);
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, aji paramaji) {
/*  42 */     int i = this.d[(paramInt2 << 8 | paramInt3 << 4 | paramInt1)] & 0xFF;
/*  43 */     if (this.e != null) {
/*  44 */       i = this.e.a(paramInt1, paramInt2, paramInt3) << 8 | i;
/*     */     }
/*     */     
/*  47 */     aji localaji = aji.e(i);
/*  48 */     if (localaji != ajn.a) {
/*  49 */       this.b -= 1;
/*  50 */       if (localaji.t()) {
/*  51 */         this.c -= 1;
/*     */       }
/*     */     }
/*     */     
/*  55 */     if (paramaji != ajn.a) {
/*  56 */       this.b += 1;
/*  57 */       if (paramaji.t()) {
/*  58 */         this.c += 1;
/*     */       }
/*     */     }
/*     */     
/*  62 */     int j = aji.b(paramaji);
/*  63 */     this.d[(paramInt2 << 8 | paramInt3 << 4 | paramInt1)] = ((byte)(j & 0xFF));
/*  64 */     if (j > 255) {
/*  65 */       if (this.e == null) {
/*  66 */         this.e = new apv(this.d.length, 4);
/*     */       }
/*  68 */       this.e.a(paramInt1, paramInt2, paramInt3, (j & 0xF00) >> 8);
/*  69 */     } else if (this.e != null) {
/*  70 */       this.e.a(paramInt1, paramInt2, paramInt3, 0);
/*     */     }
/*     */   }
/*     */   
/*     */   public int b(int paramInt1, int paramInt2, int paramInt3) {
/*  75 */     return this.f.a(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  79 */     this.f.a(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public boolean a() {
/*  83 */     return this.b == 0;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  87 */     return this.c > 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int d()
/*     */   {
/*  95 */     return this.a;
/*     */   }
/*     */   
/*     */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  99 */     this.h.a(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int c(int paramInt1, int paramInt2, int paramInt3) {
/* 103 */     return this.h.a(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 107 */     this.g.a(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int d(int paramInt1, int paramInt2, int paramInt3) {
/* 111 */     return this.g.a(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void e() {
/* 115 */     this.b = 0;
/* 116 */     this.c = 0;
/*     */     
/* 118 */     for (int i = 0; i < 16; i++) {
/* 119 */       for (int j = 0; j < 16; j++) {
/* 120 */         for (int k = 0; k < 16; k++) {
/* 121 */           aji localaji = a(i, j, k);
/*     */           
/* 123 */           if (localaji != ajn.a) {
/* 124 */             this.b += 1;
/* 125 */             if (localaji.t()) {
/* 126 */               this.c += 1;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public byte[] g()
/*     */   {
/* 139 */     return this.d;
/*     */   }
/*     */   
/*     */   public void h() {
/* 143 */     this.e = null;
/*     */   }
/*     */   
/*     */   public apv i() {
/* 147 */     return this.e;
/*     */   }
/*     */   
/*     */   public apv j() {
/* 151 */     return this.f;
/*     */   }
/*     */   
/*     */   public apv k() {
/* 155 */     return this.g;
/*     */   }
/*     */   
/*     */   public apv l() {
/* 159 */     return this.h;
/*     */   }
/*     */   
/*     */   public void a(byte[] paramArrayOfByte) {
/* 163 */     this.d = paramArrayOfByte;
/*     */   }
/*     */   
/*     */   public void a(apv paramapv) {
/* 167 */     this.e = paramapv;
/*     */   }
/*     */   
/*     */   public void b(apv paramapv) {
/* 171 */     this.f = paramapv;
/*     */   }
/*     */   
/*     */   public void c(apv paramapv) {
/* 175 */     this.g = paramapv;
/*     */   }
/*     */   
/*     */   public void d(apv paramapv) {
/* 179 */     this.h = paramapv;
/*     */   }
/*     */   
/*     */   public apv m() {
/* 183 */     this.e = new apv(this.d.length, 4);
/* 184 */     return this.e;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\apz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */