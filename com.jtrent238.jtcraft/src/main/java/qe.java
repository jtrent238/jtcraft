/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class qe
/*     */ {
/*     */   final long a;
/*     */   Object b;
/*     */   qe c;
/*     */   final int d;
/*     */   
/*     */   qe(int paramInt, long paramLong, Object paramObject, qe paramqe)
/*     */   {
/* 182 */     this.b = paramObject;
/* 183 */     this.c = paramqe;
/* 184 */     this.a = paramLong;
/* 185 */     this.d = paramInt;
/*     */   }
/*     */   
/*     */   public final long a() {
/* 189 */     return this.a;
/*     */   }
/*     */   
/*     */   public final Object b() {
/* 193 */     return this.b;
/*     */   }
/*     */   
/*     */   public final boolean equals(Object paramObject)
/*     */   {
/* 198 */     if (!(paramObject instanceof qe)) return false;
/* 199 */     qe localqe = (qe)paramObject;
/* 200 */     Long localLong1 = Long.valueOf(a());
/* 201 */     Long localLong2 = Long.valueOf(localqe.a());
/* 202 */     if ((localLong1 == localLong2) || ((localLong1 != null) && (localLong1.equals(localLong2)))) {
/* 203 */       Object localObject1 = b();
/* 204 */       Object localObject2 = localqe.b();
/* 205 */       if ((localObject1 == localObject2) || ((localObject1 != null) && (localObject1.equals(localObject2)))) return true;
/*     */     }
/* 207 */     return false;
/*     */   }
/*     */   
/*     */   public final int hashCode() {
/* 211 */     return qd.f(this.a);
/*     */   }
/*     */   
/*     */   public final String toString() {
/* 215 */     return a() + "=" + b();
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\qe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */