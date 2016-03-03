/*    */ import com.mojang.authlib.GameProfile;
/*    */ import com.mojang.authlib.ProfileLookupCallback;
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
/*    */ final class nt
/*    */   implements ProfileLookupCallback
/*    */ {
/*    */   nt(GameProfile[] paramArrayOfGameProfile) {}
/*    */   
/*    */   public void onProfileLookupSucceeded(GameProfile paramGameProfile)
/*    */   {
/* 50 */     this.a[0] = paramGameProfile;
/*    */   }
/*    */   
/*    */   public void onProfileLookupFailed(GameProfile paramGameProfile, Exception paramException)
/*    */   {
/* 55 */     this.a[0] = null;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\nt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */