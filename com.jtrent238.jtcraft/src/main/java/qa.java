/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class qa
/*     */ {
/*     */   final int a;
/*     */   Object b;
/*     */   qa c;
/*     */   final int d;
/*     */   
/*     */   qa(int paramInt1, int paramInt2, Object paramObject, qa paramqa)
/*     */   {
/* 183 */     this.b = paramObject;
/* 184 */     this.c = paramqa;
/* 185 */     this.a = paramInt2;
/* 186 */     this.d = paramInt1;
/*     */   }
/*     */   
/*     */   public final int a() {
/* 190 */     return this.a;
/*     */   }
/*     */   
/*     */   public final Object b() {
/* 194 */     return this.b;
/*     */   }
/*     */   
/*     */   public final boolean equals(Object paramObject)
/*     */   {
/* 199 */     if (!(paramObject instanceof qa)) return false;
/* 200 */     qa localqa = (qa)paramObject;
/* 201 */     Integer localInteger1 = Integer.valueOf(a());
/* 202 */     Integer localInteger2 = Integer.valueOf(localqa.a());
/* 203 */     if ((localInteger1 == localInteger2) || ((localInteger1 != null) && (localInteger1.equals(localInteger2)))) {
/* 204 */       Object localObject1 = b();
/* 205 */       Object localObject2 = localqa.b();
/* 206 */       if ((localObject1 == localObject2) || ((localObject1 != null) && (localObject1.equals(localObject2)))) return true;
/*     */     }
/* 208 */     return false;
/*     */   }
/*     */   
/*     */   public final int hashCode() {
/* 212 */     return pz.f(this.a);
/*     */   }
/*     */   
/*     */   public final String toString() {
/* 216 */     return a() + "=" + b();
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\qa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */