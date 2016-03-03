/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bia
/*     */   extends bhr
/*     */ {
/*     */   private bix[] a;
/*     */   private bix[] b;
/*  13 */   private float[] c = new float[7];
/*     */   
/*  15 */   private static final int[][] d = { { 3, 2, 2 }, { 4, 3, 2 }, { 6, 4, 3 }, { 3, 3, 3 }, { 2, 2, 3 }, { 2, 1, 2 }, { 1, 1, 2 } };
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
/*  32 */   private static final int[][] e = { { 0, 0 }, { 0, 4 }, { 0, 9 }, { 0, 16 }, { 0, 22 }, { 11, 0 }, { 13, 4 } };
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
/*     */   public bia()
/*     */   {
/*  51 */     this.a = new bix[7];
/*  52 */     float f = -3.5F;
/*  53 */     for (int i = 0; i < this.a.length; i++) {
/*  54 */       this.a[i] = new bix(this, e[i][0], e[i][1]);
/*  55 */       this.a[i].a(d[i][0] * -0.5F, 0.0F, d[i][2] * -0.5F, d[i][0], d[i][1], d[i][2]);
/*  56 */       this.a[i].a(0.0F, 24 - d[i][1], f);
/*  57 */       this.c[i] = f;
/*  58 */       if (i < this.a.length - 1) {
/*  59 */         f += (d[i][2] + d[(i + 1)][2]) * 0.5F;
/*     */       }
/*     */     }
/*     */     
/*  63 */     this.b = new bix[3];
/*  64 */     this.b[0] = new bix(this, 20, 0);
/*  65 */     this.b[0].a(-5.0F, 0.0F, d[2][2] * -0.5F, 10, 8, d[2][2]);
/*  66 */     this.b[0].a(0.0F, 16.0F, this.c[2]);
/*  67 */     this.b[1] = new bix(this, 20, 11);
/*  68 */     this.b[1].a(-3.0F, 0.0F, d[4][2] * -0.5F, 6, 4, d[4][2]);
/*  69 */     this.b[1].a(0.0F, 20.0F, this.c[4]);
/*  70 */     this.b[2] = new bix(this, 20, 18);
/*  71 */     this.b[2].a(-3.0F, 0.0F, d[4][2] * -0.5F, 6, 5, d[1][2]);
/*  72 */     this.b[2].a(0.0F, 19.0F, this.c[1]);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(sa paramsa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*     */   {
/*  81 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsa);
/*     */     
/*  83 */     for (int i = 0; i < this.a.length; i++) {
/*  84 */       this.a[i].a(paramFloat6);
/*     */     }
/*  86 */     for (i = 0; i < this.b.length; i++) {
/*  87 */       this.b[i].a(paramFloat6);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sa paramsa)
/*     */   {
/*  94 */     for (int i = 0; i < this.a.length; i++) {
/*  95 */       this.a[i].g = (qh.b(paramFloat3 * 0.9F + i * 0.15F * 3.1415927F) * 3.1415927F * 0.05F * (1 + Math.abs(i - 2)));
/*  96 */       this.a[i].c = (qh.a(paramFloat3 * 0.9F + i * 0.15F * 3.1415927F) * 3.1415927F * 0.2F * Math.abs(i - 2));
/*     */     }
/*     */     
/*  99 */     this.b[0].g = this.a[2].g;
/* 100 */     this.b[1].g = this.a[4].g;
/* 101 */     this.b[1].c = this.a[4].c;
/* 102 */     this.b[2].g = this.a[1].g;
/* 103 */     this.b[2].c = this.a[1].c;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */