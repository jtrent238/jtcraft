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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public enum bbm
/*     */ {
/*     */   private final boolean S;
/*     */   private final boolean T;
/*     */   private final String U;
/*     */   private final float V;
/*     */   private float W;
/*     */   private float X;
/*     */   
/*     */   public static bbm a(int paramInt)
/*     */   {
/* 138 */     for (bbm localbbm : ) {
/* 139 */       if (localbbm.c() == paramInt) {
/* 140 */         return localbbm;
/*     */       }
/*     */     }
/* 143 */     return null;
/*     */   }
/*     */   
/*     */   private bbm(String paramString1, boolean paramBoolean1, boolean paramBoolean2) {
/* 147 */     this(paramString1, paramBoolean1, paramBoolean2, 0.0F, 1.0F, 0.0F);
/*     */   }
/*     */   
/*     */   private bbm(String paramString1, boolean paramBoolean1, boolean paramBoolean2, float paramFloat1, float paramFloat2, float paramFloat3) {
/* 151 */     this.U = paramString1;
/* 152 */     this.S = paramBoolean1;
/* 153 */     this.T = paramBoolean2;
/* 154 */     this.W = paramFloat1;
/* 155 */     this.X = paramFloat2;
/* 156 */     this.V = paramFloat3;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 160 */     return this.S;
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 164 */     return this.T;
/*     */   }
/*     */   
/*     */   public int c() {
/* 168 */     return ordinal();
/*     */   }
/*     */   
/*     */   public String d() {
/* 172 */     return this.U;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public float f()
/*     */   {
/* 180 */     return this.X;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(float paramFloat)
/*     */   {
/* 188 */     this.X = paramFloat;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public float c(float paramFloat)
/*     */   {
/* 196 */     return qh.a((e(paramFloat) - this.W) / (this.X - this.W), 0.0F, 1.0F);
/*     */   }
/*     */   
/*     */   public float d(float paramFloat) {
/* 200 */     return e(this.W + (this.X - this.W) * qh.a(paramFloat, 0.0F, 1.0F));
/*     */   }
/*     */   
/*     */   public float e(float paramFloat) {
/* 204 */     paramFloat = f(paramFloat);
/* 205 */     return qh.a(paramFloat, this.W, this.X);
/*     */   }
/*     */   
/*     */   protected float f(float paramFloat) {
/* 209 */     if (this.V > 0.0F) {
/* 210 */       paramFloat = this.V * Math.round(paramFloat / this.V);
/*     */     }
/* 212 */     return paramFloat;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bbm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */