/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class bem
/*     */   extends bcm
/*     */ {
/*     */   public bem(bej parambej)
/*     */   {
/* 142 */     super(bej.a(parambej), parambej.l, parambej.m, 32, parambej.m - 64, 10);
/*     */     
/* 144 */     a(false);
/*     */   }
/*     */   
/*     */   protected int b()
/*     */   {
/* 149 */     return pp.c.size();
/*     */   }
/*     */   
/*     */ 
/*     */   protected void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3) {}
/*     */   
/*     */ 
/*     */   protected boolean a(int paramInt)
/*     */   {
/* 158 */     return false;
/*     */   }
/*     */   
/*     */   protected int e()
/*     */   {
/* 163 */     return b() * 10;
/*     */   }
/*     */   
/*     */   protected void a()
/*     */   {
/* 168 */     this.k.c();
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, bmh parambmh, int paramInt5, int paramInt6)
/*     */   {
/* 173 */     ph localph = (ph)pp.c.get(paramInt1);
/* 174 */     this.k.b(bej.b(this.k), localph.e().c(), paramInt2 + 2, paramInt3 + 1, paramInt1 % 2 == 0 ? 16777215 : 9474192);
/* 175 */     String str = localph.a(bej.c(this.k).a(localph));
/* 176 */     this.k.b(bej.d(this.k), str, paramInt2 + 2 + 213 - bej.e(this.k).a(str), paramInt3 + 1, paramInt1 % 2 == 0 ? 16777215 : 9474192);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */