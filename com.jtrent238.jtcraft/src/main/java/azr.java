/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ 
/*    */ public class azr implements Runnable
/*    */ {
/*  6 */   public static final azr a = new azr();
/*    */   
/*  8 */   private List b = Collections.synchronizedList(new java.util.ArrayList());
/*    */   private volatile long c;
/*    */   private volatile long d;
/*    */   private volatile boolean e;
/*    */   
/*    */   private azr()
/*    */   {
/* 15 */     Thread localThread = new Thread(this, "File IO Thread");
/* 16 */     localThread.setPriority(1);
/* 17 */     localThread.start();
/*    */   }
/*    */   
/*    */   public void run()
/*    */   {
/*    */     for (;;) {
/* 23 */       b();
/*    */     }
/*    */   }
/*    */   
/*    */   private void b() {
/* 28 */     for (int i = 0; i < this.b.size(); i++) {
/* 29 */       azs localazs = (azs)this.b.get(i);
/* 30 */       boolean bool = localazs.c();
/* 31 */       if (!bool) {
/* 32 */         this.b.remove(i--);
/* 33 */         this.d += 1L;
/*    */       }
/*    */       try
/*    */       {
/* 37 */         Thread.sleep(this.e ? 0L : 10L);
/*    */       } catch (InterruptedException localInterruptedException2) {
/* 39 */         localInterruptedException2.printStackTrace();
/*    */       }
/*    */     }
/* 42 */     if (this.b.isEmpty()) {
/*    */       try {
/* 44 */         Thread.sleep(25L);
/*    */       } catch (InterruptedException localInterruptedException1) {
/* 46 */         localInterruptedException1.printStackTrace();
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(azs paramazs) {
/* 52 */     if (this.b.contains(paramazs)) return;
/* 53 */     this.c += 1L;
/* 54 */     this.b.add(paramazs);
/*    */   }
/*    */   
/*    */   public void a() {
/* 58 */     this.e = true;
/* 59 */     while (this.c != this.d) {
/* 60 */       Thread.sleep(10L);
/*    */     }
/* 62 */     this.e = false;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\azr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */