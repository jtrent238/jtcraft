/*    */ package net.minecraft.realms;
/*    */ 
/*    */ import bao;
/*    */ import bdw;
/*    */ import java.lang.reflect.Constructor;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ public class RealmsBridge
/*    */   extends RealmsScreen
/*    */ {
/* 12 */   private static final Logger LOGGER = ;
/*    */   private bdw previousScreen;
/*    */   
/*    */   public void switchToRealms(bdw parambdw)
/*    */   {
/* 17 */     this.previousScreen = parambdw;
/*    */     try {
/* 19 */       Class localClass = Class.forName("com.mojang.realmsclient.RealmsMainScreen");
/* 20 */       Constructor localConstructor = localClass.getDeclaredConstructor(new Class[] { RealmsScreen.class });
/* 21 */       localConstructor.setAccessible(true);
/* 22 */       Object localObject = localConstructor.newInstance(new Object[] { this });
/* 23 */       bao.B().a(((RealmsScreen)localObject).getProxy());
/*    */     } catch (Exception localException) {
/* 25 */       LOGGER.error("Realms module missing", localException);
/*    */     }
/*    */   }
/*    */   
/*    */   public void init()
/*    */   {
/* 31 */     bao.B().a(this.previousScreen);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\net\minecraft\realms\RealmsBridge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */