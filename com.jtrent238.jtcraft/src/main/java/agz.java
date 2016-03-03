/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class agz
/*     */ {
/*     */   private String a;
/*     */   private boolean b;
/*     */   private int c;
/*     */   private double d;
/*     */   
/*     */   public agz(String paramString)
/*     */   {
/* 117 */     a(paramString);
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/* 121 */     this.a = paramString;
/* 122 */     this.b = Boolean.parseBoolean(paramString);
/*     */     try {
/* 124 */       this.c = Integer.parseInt(paramString);
/*     */     }
/*     */     catch (NumberFormatException localNumberFormatException1) {}
/*     */     try {
/* 128 */       this.d = Double.parseDouble(paramString);
/*     */     }
/*     */     catch (NumberFormatException localNumberFormatException2) {}
/*     */   }
/*     */   
/*     */   public String a() {
/* 134 */     return this.a;
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 138 */     return this.b;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\agz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */