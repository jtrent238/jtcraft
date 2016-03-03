/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum rd
/*    */ {
/*    */   private static final rd[] e;
/*    */   private final int f;
/*    */   private final String g;
/*    */   
/*    */   private rd(int paramInt1, String paramString1)
/*    */   {
/* 14 */     this.f = paramInt1;
/* 15 */     this.g = paramString1;
/*    */   }
/*    */   
/*    */   public int a() {
/* 19 */     return this.f;
/*    */   }
/*    */   
/*    */   public static rd a(int paramInt) {
/* 23 */     return e[(paramInt % e.length)];
/*    */   }
/*    */   
/*    */   static
/*    */   {
/*  9 */     e = new rd[values().length];
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 27 */     for (rd localrd : values()) {
/* 28 */       e[localrd.f] = localrd;
/*    */     }
/*    */   }
/*    */   
/*    */   public String b() {
/* 33 */     return this.g;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\rd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */