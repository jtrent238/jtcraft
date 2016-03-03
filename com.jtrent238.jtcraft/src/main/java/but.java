/*    */ import io.netty.util.concurrent.GenericFutureListener;
/*    */ import net.minecraft.realms.Realms;
/*    */ import net.minecraft.realms.RealmsServerStatusPinger;
/*    */ import net.minecraft.realms.ServerPing;
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
/*    */ public class but
/*    */   implements jy
/*    */ {
/*    */   public but(RealmsServerStatusPinger paramRealmsServerStatusPinger, ServerPing paramServerPing, ej paramej, String paramString) {}
/*    */   
/* 34 */   private boolean e = false;
/*    */   
/*    */   public void a(ka paramka) {
/* 37 */     kb localkb = paramka.c();
/*    */     
/* 39 */     if (localkb.b() != null) {
/* 40 */       this.a.nrOfPlayers = String.valueOf(localkb.b().b());
/*    */     }
/*    */     
/* 43 */     this.b.a(new ki(Realms.currentTimeMillis()), new GenericFutureListener[0]);
/* 44 */     this.e = true;
/*    */   }
/*    */   
/*    */   public void a(jz paramjz)
/*    */   {
/* 49 */     this.b.a(new fq("Finished"));
/*    */   }
/*    */   
/*    */   public void a(fj paramfj)
/*    */   {
/* 54 */     if (!this.e) {
/* 55 */       RealmsServerStatusPinger.access$000().error("Can't ping " + this.c + ": " + paramfj.c());
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(eo parameo1, eo parameo2)
/*    */   {
/* 61 */     if (parameo2 != eo.c) {
/* 62 */       throw new UnsupportedOperationException("Unexpected change in protocol to " + parameo2);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a() {}
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\but.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */