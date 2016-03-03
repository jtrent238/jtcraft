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
/*    */ 
/*    */ public enum zb
/*    */ {
/*    */   private static final zb[] d;
/*    */   private final int e;
/*    */   private final String f;
/*    */   
/*    */   private zb(int paramInt1, String paramString1)
/*    */   {
/* 61 */     this.e = paramInt1;
/* 62 */     this.f = paramString1;
/*    */   }
/*    */   
/*    */   public int a() {
/* 66 */     return this.e;
/*    */   }
/*    */   
/*    */   public static zb a(int paramInt) {
/* 70 */     return d[(paramInt % d.length)];
/*    */   }
/*    */   
/*    */   static
/*    */   {
/* 56 */     d = new zb[values().length];
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
/* 74 */     for (zb localzb : values()) {
/* 75 */       d[localzb.e] = localzb;
/*    */     }
/*    */   }
/*    */   
/*    */   public String b() {
/* 80 */     return this.f;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\zb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */