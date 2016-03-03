/*     */ import org.lwjgl.opengl.GL11;
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
/*     */ class bfd
/*     */   extends bcb
/*     */ {
/*     */   private final bqx o;
/*     */   private final int p;
/*     */   private final int q;
/*     */   private boolean r;
/*     */   
/*     */   protected bfd(int paramInt1, int paramInt2, int paramInt3, bqx parambqx, int paramInt4, int paramInt5)
/*     */   {
/* 185 */     super(paramInt1, paramInt2, paramInt3, 22, 22, "");
/* 186 */     this.o = parambqx;
/* 187 */     this.p = paramInt4;
/* 188 */     this.q = paramInt5;
/*     */   }
/*     */   
/*     */   public void a(bao parambao, int paramInt1, int paramInt2)
/*     */   {
/* 193 */     if (!this.m) { return;
/*     */     }
/* 195 */     parambao.P().a(bez.a());
/* 196 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */     
/* 198 */     this.n = ((paramInt1 >= this.h) && (paramInt2 >= this.i) && (paramInt1 < this.h + this.f) && (paramInt2 < this.i + this.g));
/* 199 */     int i = 219;
/* 200 */     int j = 0;
/* 201 */     if (!this.l) {
/* 202 */       j += this.f * 2;
/* 203 */     } else if (this.r) {
/* 204 */       j += this.f * 1;
/* 205 */     } else if (this.n) {
/* 206 */       j += this.f * 3;
/*     */     }
/*     */     
/* 209 */     b(this.h, this.i, j, i, this.f, this.g);
/*     */     
/* 211 */     if (!bez.a().equals(this.o)) {
/* 212 */       parambao.P().a(this.o);
/*     */     }
/*     */     
/* 215 */     b(this.h + 2, this.i + 2, this.p, this.q, 18, 18);
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 219 */     return this.r;
/*     */   }
/*     */   
/*     */   public void b(boolean paramBoolean) {
/* 223 */     this.r = paramBoolean;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bfd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */