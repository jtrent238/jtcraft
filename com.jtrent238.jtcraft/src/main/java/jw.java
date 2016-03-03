/*    */ import com.mojang.authlib.GameProfile;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class jw
/*    */   extends ft
/*    */ {
/*    */   private GameProfile a;
/*    */   
/*    */   public jw() {}
/*    */   
/*    */   public jw(GameProfile paramGameProfile)
/*    */   {
/* 18 */     this.a = paramGameProfile;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 23 */     this.a = new GameProfile(null, paramet.c(16));
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 28 */     paramet.a(this.a.getName());
/*    */   }
/*    */   
/*    */   public void a(jv paramjv)
/*    */   {
/* 33 */     paramjv.a(this);
/*    */   }
/*    */   
/*    */   public GameProfile c() {
/* 37 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\jw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */