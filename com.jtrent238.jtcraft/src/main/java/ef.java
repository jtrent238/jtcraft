/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class ef
/*     */   extends ec
/*     */ {
/*     */   protected String b;
/*     */   
/*     */   public ef(String paramString1, String paramString2)
/*     */   {
/* 315 */     this.a = paramString1;
/* 316 */     this.b = paramString2;
/*     */   }
/*     */   
/*     */   public dy a()
/*     */   {
/*     */     try
/*     */     {
/* 323 */       if (this.b.matches("[-+]?[0-9]*\\.?[0-9]+[d|D]"))
/* 324 */         return new dk(Double.parseDouble(this.b.substring(0, this.b.length() - 1)));
/* 325 */       if (this.b.matches("[-+]?[0-9]*\\.?[0-9]+[f|F]"))
/* 326 */         return new dm(Float.parseFloat(this.b.substring(0, this.b.length() - 1)));
/* 327 */       if (this.b.matches("[-+]?[0-9]+[b|B]"))
/* 328 */         return new dg(Byte.parseByte(this.b.substring(0, this.b.length() - 1)));
/* 329 */       if (this.b.matches("[-+]?[0-9]+[l|L]"))
/* 330 */         return new dr(Long.parseLong(this.b.substring(0, this.b.length() - 1)));
/* 331 */       if (this.b.matches("[-+]?[0-9]+[s|S]"))
/* 332 */         return new dw(Short.parseShort(this.b.substring(0, this.b.length() - 1)));
/* 333 */       if (this.b.matches("[-+]?[0-9]+"))
/* 334 */         return new dp(Integer.parseInt(this.b.substring(0, this.b.length())));
/* 335 */       if (this.b.matches("[-+]?[0-9]*\\.?[0-9]+"))
/* 336 */         return new dk(Double.parseDouble(this.b.substring(0, this.b.length())));
/* 337 */       if ((this.b.equalsIgnoreCase("true")) || (this.b.equalsIgnoreCase("false"))) {
/* 338 */         return new dg((byte)(Boolean.parseBoolean(this.b) ? 1 : 0));
/*     */       }
/* 340 */       if ((this.b.startsWith("[")) && (this.b.endsWith("]"))) {
/* 341 */         if (this.b.length() > 2) {
/* 342 */           String str = this.b.substring(1, this.b.length() - 1);
/* 343 */           String[] arrayOfString = str.split(",");
/*     */           try {
/* 345 */             if (arrayOfString.length <= 1) {
/* 346 */               return new dn(new int[] { Integer.parseInt(str.trim()) });
/*     */             }
/*     */             
/*     */ 
/* 350 */             int[] arrayOfInt = new int[arrayOfString.length];
/* 351 */             for (int i = 0; i < arrayOfString.length; i++) {
/* 352 */               arrayOfInt[i] = Integer.parseInt(arrayOfString[i].trim());
/*     */             }
/* 354 */             return new dn(arrayOfInt);
/*     */           }
/*     */           catch (NumberFormatException localNumberFormatException2) {
/* 357 */             return new dx(this.b);
/*     */           }
/*     */         }
/* 360 */         return new dn();
/*     */       }
/*     */       
/* 363 */       if ((this.b.startsWith("\"")) && (this.b.endsWith("\"")) && (this.b.length() > 2)) {
/* 364 */         this.b = this.b.substring(1, this.b.length() - 1);
/*     */       }
/*     */       
/* 367 */       this.b = this.b.replaceAll("\\\\\"", "\"");
/* 368 */       return new dx(this.b);
/*     */     }
/*     */     catch (NumberFormatException localNumberFormatException1) {
/* 371 */       this.b = this.b.replaceAll("\\\\\"", "\""); }
/* 372 */     return new dx(this.b);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */