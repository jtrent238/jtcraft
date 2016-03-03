/*    */ import com.mojang.authlib.GameProfile;
/*    */ import java.util.UUID;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class js
/*    */   extends ft
/*    */ {
/*    */   private GameProfile a;
/*    */   
/*    */   public js() {}
/*    */   
/*    */   public js(GameProfile paramGameProfile)
/*    */   {
/* 19 */     this.a = paramGameProfile;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 24 */     String str1 = paramet.c(36);
/* 25 */     String str2 = paramet.c(16);
/* 26 */     UUID localUUID = UUID.fromString(str1);
/* 27 */     this.a = new GameProfile(localUUID, str2);
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 32 */     UUID localUUID = this.a.getId();
/* 33 */     paramet.a(localUUID == null ? "" : localUUID.toString());
/* 34 */     paramet.a(this.a.getName());
/*    */   }
/*    */   
/*    */   public void a(jr paramjr)
/*    */   {
/* 39 */     paramjr.a(this);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 44 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\js.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */