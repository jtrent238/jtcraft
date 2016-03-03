/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class la
/*     */   extends cm
/*     */ {
/* 159 */   private final cm b = new cm();
/*     */   
/*     */   public add b(ck paramck, add paramadd)
/*     */   {
/* 163 */     cr localcr = akm.b(paramck.h());
/* 164 */     ahb localahb = paramck.k();
/*     */     
/*     */ 
/* 167 */     double d1 = paramck.a() + localcr.c() * 1.125F;
/* 168 */     double d2 = paramck.b() + localcr.d() * 1.125F;
/* 169 */     double d3 = paramck.c() + localcr.e() * 1.125F;
/*     */     
/* 171 */     int i = paramck.d() + localcr.c();
/* 172 */     int j = paramck.e() + localcr.d();
/* 173 */     int k = paramck.f() + localcr.e();
/* 174 */     awt localawt = localahb.a(i, j, k).o();
/*     */     
/*     */     double d4;
/* 177 */     if (awt.h.equals(localawt)) {
/* 178 */       d4 = 1.0D;
/* 179 */     } else if ((awt.a.equals(localawt)) && (awt.h.equals(localahb.a(i, j - 1, k).o()))) {
/* 180 */       d4 = 0.0D;
/*     */     } else {
/* 182 */       return this.b.a(paramck, paramadd);
/*     */     }
/*     */     
/* 185 */     xi localxi = new xi(localahb, d1, d2 + d4, d3);
/* 186 */     localahb.d(localxi);
/*     */     
/* 188 */     paramadd.a(1);
/* 189 */     return paramadd;
/*     */   }
/*     */   
/*     */   protected void a(ck paramck)
/*     */   {
/* 194 */     paramck.k().c(1000, paramck.d(), paramck.e(), paramck.f(), 0);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\la.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */