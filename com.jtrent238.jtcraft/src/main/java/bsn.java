/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bsn
/*    */   extends bsl
/*    */ {
/*    */   private final yz k;
/*    */   private final xl l;
/*    */   
/*    */   public bsn(yz paramyz, xl paramxl)
/*    */   {
/* 16 */     super(new bqx("minecraft:minecart.inside"));
/*    */     
/* 18 */     this.k = paramyz;
/* 19 */     this.l = paramxl;
/*    */     
/* 21 */     this.i = bsu.a;
/* 22 */     this.g = true;
/* 23 */     this.h = 0;
/*    */   }
/*    */   
/*    */   public void a()
/*    */   {
/* 28 */     if ((this.l.K) || (!this.k.am()) || (this.k.m != this.l)) {
/* 29 */       this.j = true;
/* 30 */       return;
/*    */     }
/*    */     
/* 33 */     float f = qh.a(this.l.v * this.l.v + this.l.x * this.l.x);
/* 34 */     if (f >= 0.01D) {
/* 35 */       this.b = (0.0F + qh.a(f, 0.0F, 1.0F) * 0.75F);
/*    */     } else {
/* 37 */       this.b = 0.0F;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bsn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */