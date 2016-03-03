/*    */ package net.minecraft.realms;
/*    */ 
/*    */ import ahk;
/*    */ import bao;
/*    */ import bbj;
/*    */ import bbs;
/*    */ import com.mojang.authlib.GameProfile;
/*    */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*    */ 
/*    */ public class Realms
/*    */ {
/*    */   public static boolean isTouchScreen()
/*    */   {
/* 14 */     return bao.B().u.y;
/*    */   }
/*    */   
/*    */   public static java.net.Proxy getProxy() {
/* 18 */     return bao.B().O();
/*    */   }
/*    */   
/*    */   public static String sessionId() {
/* 22 */     bbs localbbs = bao.B().M();
/* 23 */     if (localbbs == null) {
/* 24 */       return null;
/*    */     }
/* 26 */     return localbbs.a();
/*    */   }
/*    */   
/*    */   public static String userName() {
/* 30 */     bbs localbbs = bao.B().M();
/* 31 */     if (localbbs == null) {
/* 32 */       return null;
/*    */     }
/* 34 */     return localbbs.c();
/*    */   }
/*    */   
/*    */   public static long currentTimeMillis() {
/* 38 */     return bao.K();
/*    */   }
/*    */   
/*    */   public static String getSessionId() {
/* 42 */     return bao.B().M().a();
/*    */   }
/*    */   
/*    */   public static String getName() {
/* 46 */     return bao.B().M().c();
/*    */   }
/*    */   
/*    */   public static String uuidToName(String paramString) {
/* 50 */     return bao.B().ac().fillProfileProperties(new GameProfile(java.util.UUID.fromString(paramString.replaceAll("(\\w{8})(\\w{4})(\\w{4})(\\w{4})(\\w{12})", "$1-$2-$3-$4-$5")), null), false).getName();
/*    */   }
/*    */   
/*    */   public static void setScreen(RealmsScreen paramRealmsScreen) {
/* 54 */     bao.B().a(paramRealmsScreen.getProxy());
/*    */   }
/*    */   
/*    */   public static String getGameDirectoryPath() {
/* 58 */     return bao.B().w.getAbsolutePath();
/*    */   }
/*    */   
/*    */   public static int survivalId() {
/* 62 */     return ahk.b.a();
/*    */   }
/*    */   
/*    */   public static int creativeId() {
/* 66 */     return ahk.c.a();
/*    */   }
/*    */   
/*    */   public static int adventureId() {
/* 70 */     return ahk.d.a();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\net\minecraft\realms\Realms.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */