/*    */ 
/*    */ public class btw
/*    */   extends btz
/*    */ {
/*    */   public btw(pb parampb)
/*    */   {
/*  7 */     super("achievement");
/*    */     
/*  9 */     a("achievement_id", parampb.e);
/* 10 */     a("achievement_name", parampb.e().c());
/* 11 */     a("achievement_description", parampb.f());
/*    */     
/* 13 */     a("Achievement '" + parampb.e().c() + "' obtained!");
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\btw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */