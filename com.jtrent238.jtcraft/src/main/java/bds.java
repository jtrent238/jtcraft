/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class bds
/*     */   extends bcm
/*     */ {
/* 204 */   public int k = -1;
/*     */   
/*     */   public bds(bdq parambdq) {
/* 207 */     super(parambdq.k, parambdq.l, parambdq.m, 80, parambdq.m - 37, 24);
/*     */   }
/*     */   
/*     */   private void a(int paramInt1, int paramInt2, adb paramadb) {
/* 211 */     e(paramInt1 + 1, paramInt2 + 1);
/*     */     
/* 213 */     GL11.glEnable(32826);
/*     */     
/* 215 */     bam.c();
/*     */     
/* 217 */     bdq.f().a(this.l.q, this.l.k.P(), new add(paramadb, 1, 0), paramInt1 + 2, paramInt2 + 2);
/* 218 */     bam.a();
/*     */     
/* 220 */     GL11.glDisable(32826);
/*     */   }
/*     */   
/*     */   private void e(int paramInt1, int paramInt2) {
/* 224 */     c(paramInt1, paramInt2, 0, 0);
/*     */   }
/*     */   
/*     */   private void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 228 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 229 */     this.l.k.P().a(bbw.c);
/*     */     
/* 231 */     float f1 = 0.0078125F;
/* 232 */     float f2 = 0.0078125F;
/* 233 */     int i = 18;
/* 234 */     int j = 18;
/* 235 */     bmh localbmh = bmh.a;
/* 236 */     localbmh.b();
/* 237 */     localbmh.a(paramInt1 + 0, paramInt2 + 18, bdq.a(this.l), (paramInt3 + 0) * 0.0078125F, (paramInt4 + 18) * 0.0078125F);
/* 238 */     localbmh.a(paramInt1 + 18, paramInt2 + 18, bdq.b(this.l), (paramInt3 + 18) * 0.0078125F, (paramInt4 + 18) * 0.0078125F);
/* 239 */     localbmh.a(paramInt1 + 18, paramInt2 + 0, bdq.c(this.l), (paramInt3 + 18) * 0.0078125F, (paramInt4 + 0) * 0.0078125F);
/* 240 */     localbmh.a(paramInt1 + 0, paramInt2 + 0, bdq.d(this.l), (paramInt3 + 0) * 0.0078125F, (paramInt4 + 0) * 0.0078125F);
/* 241 */     localbmh.a();
/*     */   }
/*     */   
/*     */   protected int b()
/*     */   {
/* 246 */     return bdq.g().size();
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
/*     */   {
/* 251 */     this.k = paramInt1;
/* 252 */     this.l.a();
/* 253 */     bdq.f(this.l).a(((bdr)bdq.g().get(bdq.e(this.l).k)).c);
/*     */   }
/*     */   
/*     */   protected boolean a(int paramInt)
/*     */   {
/* 258 */     return paramInt == this.k;
/*     */   }
/*     */   
/*     */ 
/*     */   protected void a() {}
/*     */   
/*     */ 
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, bmh parambmh, int paramInt5, int paramInt6)
/*     */   {
/* 267 */     bdr localbdr = (bdr)bdq.g().get(paramInt1);
/* 268 */     a(paramInt2, paramInt3, localbdr.a);
/* 269 */     this.l.q.b(localbdr.b, paramInt2 + 18 + 5, paramInt3 + 6, 16777215);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */