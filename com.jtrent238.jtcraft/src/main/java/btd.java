/*    */ import java.net.InetAddress;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collections;
/*    */ import java.util.List;
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
/*    */ public class btd
/*    */ {
/* 18 */   private ArrayList b = new ArrayList();
/*    */   boolean a;
/*    */   
/*    */   public synchronized boolean a() {
/* 22 */     return this.a;
/*    */   }
/*    */   
/*    */   public synchronized void b() {
/* 26 */     this.a = false;
/*    */   }
/*    */   
/*    */   public synchronized List c() {
/* 30 */     return Collections.unmodifiableList(this.b);
/*    */   }
/*    */   
/*    */   public synchronized void a(String paramString, InetAddress paramInetAddress) {
/* 34 */     String str1 = bte.a(paramString);
/* 35 */     String str2 = bte.b(paramString);
/* 36 */     if (str2 == null) {
/* 37 */       return;
/*    */     }
/*    */     
/* 40 */     str2 = paramInetAddress.getHostAddress() + ":" + str2;
/*    */     
/* 42 */     int i = 0;
/* 43 */     for (btb localbtb : this.b) {
/* 44 */       if (localbtb.b().equals(str2)) {
/* 45 */         localbtb.c();
/* 46 */         i = 1;
/* 47 */         break;
/*    */       }
/*    */     }
/*    */     
/* 51 */     if (i == 0) {
/* 52 */       this.b.add(new btb(str1, str2));
/* 53 */       this.a = true;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\btd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */