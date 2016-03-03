/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bpw
/*     */   implements Comparable
/*     */ {
/*     */   private final bqd a;
/*     */   private final int b;
/*     */   private final int c;
/*     */   private final int d;
/*     */   private boolean e;
/* 197 */   private float f = 1.0F;
/*     */   
/*     */   public bpw(bqd parambqd, int paramInt) {
/* 200 */     this.a = parambqd;
/* 201 */     this.b = parambqd.a();
/* 202 */     this.c = parambqd.b();
/* 203 */     this.d = paramInt;
/*     */     
/* 205 */     this.e = (bpv.a(this.c, paramInt) > bpv.a(this.b, paramInt));
/*     */   }
/*     */   
/*     */   public bqd a() {
/* 209 */     return this.a;
/*     */   }
/*     */   
/*     */   public int b() {
/* 213 */     return this.e ? bpv.a((int)(this.c * this.f), this.d) : bpv.a((int)(this.b * this.f), this.d);
/*     */   }
/*     */   
/*     */   public int c() {
/* 217 */     return this.e ? bpv.a((int)(this.b * this.f), this.d) : bpv.a((int)(this.c * this.f), this.d);
/*     */   }
/*     */   
/*     */   public void d() {
/* 221 */     this.e = (!this.e);
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 225 */     return this.e;
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/* 229 */     if ((this.b <= paramInt) || (this.c <= paramInt)) {
/* 230 */       return;
/*     */     }
/*     */     
/* 233 */     this.f = (paramInt / Math.min(this.b, this.c));
/*     */   }
/*     */   
/*     */   public String toString()
/*     */   {
/* 238 */     return "Holder{width=" + this.b + ", height=" + this.c + '}';
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public int a(bpw parambpw)
/*     */   {
/*     */     int i;
/*     */     
/* 247 */     if (c() == parambpw.c()) {
/* 248 */       if (b() == parambpw.b()) {
/* 249 */         if (this.a.g() == null) {
/* 250 */           return parambpw.a.g() == null ? 0 : -1;
/*     */         }
/* 252 */         return this.a.g().compareTo(parambpw.a.g());
/*     */       }
/* 254 */       i = b() < parambpw.b() ? 1 : -1;
/*     */     } else {
/* 256 */       i = c() < parambpw.c() ? 1 : -1;
/*     */     }
/* 258 */     return i;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bpw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */