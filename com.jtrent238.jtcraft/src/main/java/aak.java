/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aak
/*    */   extends aay
/*    */ {
/*    */   private yz a;
/*    */   private int b;
/*    */   
/*    */   public aak(yz paramyz, rb paramrb, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 17 */     super(paramrb, paramInt1, paramInt2, paramInt3);
/*    */     
/* 19 */     this.a = paramyz;
/*    */   }
/*    */   
/*    */   public boolean a(add paramadd)
/*    */   {
/* 24 */     return false;
/*    */   }
/*    */   
/*    */   public add a(int paramInt)
/*    */   {
/* 29 */     if (e()) {
/* 30 */       this.b += Math.min(paramInt, d().b);
/*    */     }
/* 32 */     return super.a(paramInt);
/*    */   }
/*    */   
/*    */   public void a(yz paramyz, add paramadd)
/*    */   {
/* 37 */     b(paramadd);
/* 38 */     super.a(paramyz, paramadd);
/*    */   }
/*    */   
/*    */   protected void a(add paramadd, int paramInt)
/*    */   {
/* 43 */     this.b += paramInt;
/* 44 */     b(paramadd);
/*    */   }
/*    */   
/*    */   protected void b(add paramadd)
/*    */   {
/* 49 */     paramadd.a(this.a.o, this.a, this.b);
/*    */     
/* 51 */     if (!this.a.o.E) {
/* 52 */       int i = this.b;
/* 53 */       float f = afa.a().b(paramadd);
/*    */       int j;
/* 55 */       if (f == 0.0F) {
/* 56 */         i = 0;
/* 57 */       } else if (f < 1.0F) {
/* 58 */         j = qh.d(i * f);
/* 59 */         if ((j < qh.f(i * f)) && ((float)Math.random() < i * f - j)) {
/* 60 */           j++;
/*    */         }
/* 62 */         i = j;
/*    */       }
/*    */       
/* 65 */       while (i > 0) {
/* 66 */         j = sq.a(i);
/* 67 */         i -= j;
/* 68 */         this.a.o.d(new sq(this.a.o, this.a.s, this.a.t + 0.5D, this.a.u + 0.5D, j));
/*    */       }
/*    */     }
/* 71 */     this.b = 0;
/*    */     
/* 73 */     if (paramadd.b() == ade.j) this.a.a(pc.k, 1);
/* 74 */     if (paramadd.b() == ade.aQ) this.a.a(pc.p, 1);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */