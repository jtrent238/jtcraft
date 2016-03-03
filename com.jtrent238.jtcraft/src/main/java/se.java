/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public enum se
/*     */ {
/*     */   public int a(double paramDouble)
/*     */   {
/* 129 */     double d1 = paramDouble - (qh.c(paramDouble) + 0.5D);
/*     */     
/* 131 */     switch (sd.a[ordinal()]) {
/*     */     case 1: 
/* 133 */       if (d1 < 0.0D ? d1 < -0.3125D : d1 < 0.3125D) {
/* 134 */         return qh.f(paramDouble * 32.0D);
/*     */       }
/*     */       
/* 137 */       return qh.c(paramDouble * 32.0D);
/*     */     case 2: 
/* 139 */       if (d1 < 0.0D ? d1 < -0.3125D : d1 < 0.3125D) {
/* 140 */         return qh.c(paramDouble * 32.0D);
/*     */       }
/*     */       
/* 143 */       return qh.f(paramDouble * 32.0D);
/*     */     case 3: 
/* 145 */       if (d1 > 0.0D) {
/* 146 */         return qh.c(paramDouble * 32.0D);
/*     */       }
/*     */       
/* 149 */       return qh.f(paramDouble * 32.0D);
/*     */     case 4: 
/* 151 */       if (d1 < 0.0D ? d1 < -0.1875D : d1 < 0.1875D) {
/* 152 */         return qh.f(paramDouble * 32.0D);
/*     */       }
/*     */       
/* 155 */       return qh.c(paramDouble * 32.0D);
/*     */     case 5: 
/* 157 */       if (d1 < 0.0D ? d1 < -0.1875D : d1 < 0.1875D) {
/* 158 */         return qh.c(paramDouble * 32.0D);
/*     */       }
/*     */       
/* 161 */       return qh.f(paramDouble * 32.0D);
/*     */     }
/*     */     
/* 164 */     if (d1 > 0.0D) {
/* 165 */       return qh.f(paramDouble * 32.0D);
/*     */     }
/*     */     
/* 168 */     return qh.c(paramDouble * 32.0D);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\se.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */