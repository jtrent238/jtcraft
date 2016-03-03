/*    */ import io.netty.util.concurrent.GenericFutureListener;
/*    */ import java.net.InetAddress;
/*    */ import java.net.UnknownHostException;
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
/*    */ class bcy
/*    */   extends Thread
/*    */ {
/* 45 */   bcy(bcx parambcx, String paramString1, String paramString2, int paramInt) { super(paramString1); }
/*    */   
/*    */   public void run() {
/* 48 */     InetAddress localInetAddress = null;
/*    */     try {
/* 50 */       if (bcx.a(this.c)) return;
/* 51 */       localInetAddress = InetAddress.getByName(this.a);
/* 52 */       bcx.a(this.c, ej.a(localInetAddress, this.b));
/* 53 */       bcx.b(this.c).a(new biz(bcx.b(this.c), this.c.k, bcx.c(this.c)));
/* 54 */       bcx.b(this.c).a(new jp(5, this.a, this.b, eo.d), new GenericFutureListener[0]);
/* 55 */       bcx.b(this.c).a(new jw(this.c.k.M().e()), new GenericFutureListener[0]);
/*    */     } catch (UnknownHostException localUnknownHostException) {
/* 57 */       if (bcx.a(this.c)) return;
/* 58 */       bcx.a().error("Couldn't connect to server", localUnknownHostException);
/* 59 */       this.c.k.a(new bdf(bcx.c(this.c), "connect.failed", new fr("disconnect.genericReason", new Object[] { "Unknown host" })));
/*    */     } catch (Exception localException) {
/* 61 */       if (bcx.a(this.c)) return;
/* 62 */       bcx.a().error("Couldn't connect to server", localException);
/* 63 */       String str1 = localException.toString();
/* 64 */       if (localInetAddress != null) {
/* 65 */         String str2 = localInetAddress.toString() + ":" + this.b;
/* 66 */         str1 = str1.replaceAll(str2, "");
/*    */       }
/* 68 */       this.c.k.a(new bdf(bcx.c(this.c), "connect.failed", new fr("disconnect.genericReason", new Object[] { str1 })));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bcy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */