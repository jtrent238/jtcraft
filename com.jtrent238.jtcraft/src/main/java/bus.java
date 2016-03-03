/*    */ import io.netty.util.concurrent.GenericFutureListener;
/*    */ import java.net.InetAddress;
/*    */ import java.net.UnknownHostException;
/*    */ import net.minecraft.realms.DisconnectedOnlineScreen;
/*    */ import net.minecraft.realms.Realms;
/*    */ import net.minecraft.realms.RealmsConnect;
/*    */ import net.minecraft.realms.RealmsScreen;
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
/*    */ public class bus
/*    */   extends Thread
/*    */ {
/* 30 */   public bus(RealmsConnect paramRealmsConnect, String paramString1, String paramString2, int paramInt) { super(paramString1); }
/*    */   
/*    */   public void run() {
/* 33 */     InetAddress localInetAddress = null;
/*    */     try {
/* 35 */       localInetAddress = InetAddress.getByName(this.a);
/* 36 */       if (RealmsConnect.access$000(this.c)) return;
/* 37 */       RealmsConnect.access$102(this.c, ej.a(localInetAddress, this.b));
/* 38 */       if (RealmsConnect.access$000(this.c)) return;
/* 39 */       RealmsConnect.access$100(this.c).a(new biz(RealmsConnect.access$100(this.c), bao.B(), RealmsConnect.access$200(this.c).getProxy()));
/* 40 */       if (RealmsConnect.access$000(this.c)) return;
/* 41 */       RealmsConnect.access$100(this.c).a(new jp(5, this.a, this.b, eo.d), new GenericFutureListener[0]);
/* 42 */       if (RealmsConnect.access$000(this.c)) return;
/* 43 */       RealmsConnect.access$100(this.c).a(new jw(bao.B().M().e()), new GenericFutureListener[0]);
/*    */     } catch (UnknownHostException localUnknownHostException) {
/* 45 */       if (RealmsConnect.access$000(this.c)) return;
/* 46 */       RealmsConnect.access$300().error("Couldn't connect to world", localUnknownHostException);
/* 47 */       Realms.setScreen(new DisconnectedOnlineScreen(RealmsConnect.access$200(this.c), "connect.failed", new fr("disconnect.genericReason", new Object[] { "Unknown host '" + this.a + "'" })));
/*    */     } catch (Exception localException) {
/* 49 */       if (RealmsConnect.access$000(this.c)) return;
/* 50 */       RealmsConnect.access$300().error("Couldn't connect to world", localException);
/* 51 */       String str1 = localException.toString();
/* 52 */       if (localInetAddress != null) {
/* 53 */         String str2 = localInetAddress.toString() + ":" + this.b;
/* 54 */         str1 = str1.replaceAll(str2, "");
/*    */       }
/* 56 */       Realms.setScreen(new DisconnectedOnlineScreen(RealmsConnect.access$200(this.c), "connect.failed", new fr("disconnect.genericReason", new Object[] { str1 })));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */