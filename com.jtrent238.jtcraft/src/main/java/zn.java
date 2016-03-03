/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class zn
/*    */   extends zk
/*    */ {
/*    */   public zn(ahb paramahb)
/*    */   {
/* 11 */     super(paramahb);
/*    */   }
/*    */   
/*    */   public zn(ahb paramahb, sv paramsv) {
/* 15 */     super(paramahb, paramsv);
/*    */   }
/*    */   
/*    */   public zn(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3) {
/* 19 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3);
/*    */   }
/*    */   
/*    */   protected float i()
/*    */   {
/* 24 */     return 0.07F;
/*    */   }
/*    */   
/*    */   protected float e()
/*    */   {
/* 29 */     return 0.7F;
/*    */   }
/*    */   
/*    */   protected float f()
/*    */   {
/* 34 */     return -20.0F;
/*    */   }
/*    */   
/*    */ 
/*    */   protected void a(azu paramazu)
/*    */   {
/* 40 */     if (!this.o.E) {
/* 41 */       this.o.c(2002, (int)Math.round(this.s), (int)Math.round(this.t), (int)Math.round(this.u), 0);
/*    */       
/* 43 */       int i = 3 + this.o.s.nextInt(5) + this.o.s.nextInt(5);
/* 44 */       while (i > 0) {
/* 45 */         int j = sq.a(i);
/* 46 */         i -= j;
/* 47 */         this.o.d(new sq(this.o, this.s, this.t, this.u, j));
/*    */       }
/*    */       
/* 50 */       B();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\zn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */