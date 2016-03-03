/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum ahk
/*    */ {
/*    */   int e;
/*    */   String f;
/*    */   
/*    */   private ahk(int paramInt1, String paramString1)
/*    */   {
/* 15 */     this.e = paramInt1;
/* 16 */     this.f = paramString1;
/*    */   }
/*    */   
/*    */   public int a() {
/* 20 */     return this.e;
/*    */   }
/*    */   
/*    */   public String b() {
/* 24 */     return this.f;
/*    */   }
/*    */   
/*    */   public void a(yw paramyw) {
/* 28 */     if (this == c) {
/* 29 */       paramyw.c = true;
/* 30 */       paramyw.d = true;
/* 31 */       paramyw.a = true;
/*    */     } else {
/* 33 */       paramyw.c = false;
/* 34 */       paramyw.d = false;
/* 35 */       paramyw.a = false;
/* 36 */       paramyw.b = false;
/*    */     }
/* 38 */     paramyw.e = (!c());
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 42 */     return this == d;
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 46 */     return this == c;
/*    */   }
/*    */   
/*    */   public boolean e() {
/* 50 */     return (this == b) || (this == d);
/*    */   }
/*    */   
/*    */   public static ahk a(int paramInt) {
/* 54 */     for (ahk localahk : ) {
/* 55 */       if (localahk.e == paramInt) {
/* 56 */         return localahk;
/*    */       }
/*    */     }
/* 59 */     return b;
/*    */   }
/*    */   
/*    */   public static ahk a(String paramString) {
/* 63 */     for (ahk localahk : ) {
/* 64 */       if (localahk.f.equals(paramString)) {
/* 65 */         return localahk;
/*    */       }
/*    */     }
/* 68 */     return b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ahk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */