/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aiy
/*    */   extends aia
/*    */ {
/* 13 */   protected arn J = new asl(ajn.bs);
/*    */   
/*    */   protected void a(ahu paramahu)
/*    */   {
/* 17 */     a();
/*    */     
/* 19 */     if (this.b.nextInt(5) == 0) {
/* 20 */       int i = this.c + this.b.nextInt(16) + 8;
/* 21 */       int j = this.d + this.b.nextInt(16) + 8;
/* 22 */       int k = this.a.i(i, j);
/* 23 */       this.J.a(this.a, this.b, i, k, j);
/*    */     }
/*    */     
/* 26 */     if ((this.c == 0) && (this.d == 0)) {
/* 27 */       xa localxa = new xa(this.a);
/* 28 */       localxa.b(0.0D, 128.0D, 0.0D, this.b.nextFloat() * 360.0F, 0.0F);
/* 29 */       this.a.d(localxa);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aiy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */