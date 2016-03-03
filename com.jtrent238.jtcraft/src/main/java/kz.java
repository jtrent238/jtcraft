/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class kz
/*     */   extends cm
/*     */ {
/*     */   public add b(ck paramck, add paramadd)
/*     */   {
/* 132 */     cr localcr = akm.b(paramck.h());
/*     */     
/* 134 */     cx localcx = akm.a(paramck);
/* 135 */     double d1 = localcx.a() + localcr.c() * 0.3F;
/* 136 */     double d2 = localcx.b() + localcr.c() * 0.3F;
/* 137 */     double d3 = localcx.c() + localcr.e() * 0.3F;
/*     */     
/* 139 */     ahb localahb = paramck.k();
/* 140 */     Random localRandom = localahb.s;
/*     */     
/* 142 */     double d4 = localRandom.nextGaussian() * 0.05D + localcr.c();
/* 143 */     double d5 = localRandom.nextGaussian() * 0.05D + localcr.d();
/* 144 */     double d6 = localRandom.nextGaussian() * 0.05D + localcr.e();
/*     */     
/* 146 */     localahb.d(new zi(localahb, d1, d2, d3, d4, d5, d6));
/*     */     
/* 148 */     paramadd.a(1);
/* 149 */     return paramadd;
/*     */   }
/*     */   
/*     */   protected void a(ck paramck)
/*     */   {
/* 154 */     paramck.k().c(1009, paramck.d(), paramck.e(), paramck.f(), 0);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\kz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */