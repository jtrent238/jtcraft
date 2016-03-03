/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class btg
/*    */   implements lr
/*    */ {
/* 14 */   private final Random a = new Random();
/*    */   private final bao b;
/*    */   private bst c;
/* 17 */   private int d = 100;
/*    */   
/*    */   public btg(bao parambao) {
/* 20 */     this.b = parambao;
/*    */   }
/*    */   
/*    */   public void a()
/*    */   {
/* 25 */     bth localbth = this.b.Y();
/*    */     
/* 27 */     if (this.c != null) {
/* 28 */       if (!localbth.a().equals(this.c.b())) {
/* 29 */         this.b.X().b(this.c);
/* 30 */         this.d = qh.a(this.a, 0, localbth.b() / 2);
/*    */       }
/*    */       
/* 33 */       if (!this.b.X().c(this.c)) {
/* 34 */         this.c = null;
/* 35 */         this.d = Math.min(qh.a(this.a, localbth.b(), localbth.c()), this.d);
/*    */       }
/*    */     }
/*    */     
/* 39 */     if ((this.c == null) && (this.d-- <= 0)) {
/* 40 */       this.c = bso.a(localbth.a());
/* 41 */       this.b.X().a(this.c);
/* 42 */       this.d = Integer.MAX_VALUE;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\btg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */