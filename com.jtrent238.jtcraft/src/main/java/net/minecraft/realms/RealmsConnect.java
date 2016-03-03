/*    */ package net.minecraft.realms;
/*    */ 
/*    */ import bus;
/*    */ import ej;
/*    */ import fb;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RealmsConnect
/*    */ {
/* 19 */   private static final Logger LOGGER = ;
/*    */   
/*    */   private final RealmsScreen onlineScreen;
/* 22 */   private volatile boolean aborted = false;
/*    */   private ej connection;
/*    */   
/*    */   public RealmsConnect(RealmsScreen paramRealmsScreen) {
/* 26 */     this.onlineScreen = paramRealmsScreen;
/*    */   }
/*    */   
/*    */   public void connect(String paramString, int paramInt) {
/* 30 */     new bus(this, "Realms-connect-task", paramString, paramInt).start();
/*    */   }
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
/*    */   public void abort()
/*    */   {
/* 63 */     this.aborted = true;
/*    */   }
/*    */   
/*    */   public void tick() {
/* 67 */     if (this.connection != null) {
/* 68 */       if (this.connection.d()) {
/* 69 */         this.connection.a();
/* 70 */       } else if (this.connection.f() != null) {
/* 71 */         this.connection.e().a(this.connection.f());
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\net\minecraft\realms\RealmsConnect.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */