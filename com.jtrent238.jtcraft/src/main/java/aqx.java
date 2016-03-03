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
/*    */ public class aqx
/*    */ {
/* 13 */   protected int a = 8;
/* 14 */   protected Random b = new Random();
/*    */   protected ahb c;
/*    */   
/*    */   public void a(apu paramapu, ahb paramahb, int paramInt1, int paramInt2, aji[] paramArrayOfaji) {
/* 18 */     int i = this.a;
/* 19 */     this.c = paramahb;
/*    */     
/* 21 */     this.b.setSeed(paramahb.H());
/* 22 */     long l1 = this.b.nextLong();
/* 23 */     long l2 = this.b.nextLong();
/*    */     
/* 25 */     for (int j = paramInt1 - i; j <= paramInt1 + i; j++) {
/* 26 */       for (int k = paramInt2 - i; k <= paramInt2 + i; k++) {
/* 27 */         long l3 = j * l1;
/* 28 */         long l4 = k * l2;
/* 29 */         this.b.setSeed(l3 ^ l4 ^ paramahb.H());
/* 30 */         a(paramahb, j, k, paramInt1, paramInt2, paramArrayOfaji);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   protected void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, aji[] paramArrayOfaji) {}
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aqx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */