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
/*    */ abstract class aue
/*    */   extends avk
/*    */ {
/*    */   protected int a;
/*    */   protected int b;
/*    */   protected int c;
/* 27 */   protected int d = -1;
/*    */   
/*    */ 
/*    */   public aue() {}
/*    */   
/*    */   protected aue(Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 34 */     super(0);
/*    */     
/* 36 */     this.a = paramInt4;
/* 37 */     this.b = paramInt5;
/* 38 */     this.c = paramInt6;
/*    */     
/* 40 */     this.g = paramRandom.nextInt(4);
/*    */     
/* 42 */     switch (this.g) {
/*    */     case 0: 
/*    */     case 2: 
/* 45 */       this.f = new asv(paramInt1, paramInt2, paramInt3, paramInt1 + paramInt4 - 1, paramInt2 + paramInt5 - 1, paramInt3 + paramInt6 - 1);
/* 46 */       break;
/*    */     default: 
/* 48 */       this.f = new asv(paramInt1, paramInt2, paramInt3, paramInt1 + paramInt6 - 1, paramInt2 + paramInt5 - 1, paramInt3 + paramInt4 - 1);
/*    */     }
/*    */     
/*    */   }
/*    */   
/*    */   protected void a(dh paramdh)
/*    */   {
/* 55 */     paramdh.a("Width", this.a);
/* 56 */     paramdh.a("Height", this.b);
/* 57 */     paramdh.a("Depth", this.c);
/* 58 */     paramdh.a("HPos", this.d);
/*    */   }
/*    */   
/*    */   protected void b(dh paramdh)
/*    */   {
/* 63 */     this.a = paramdh.f("Width");
/* 64 */     this.b = paramdh.f("Height");
/* 65 */     this.c = paramdh.f("Depth");
/* 66 */     this.d = paramdh.f("HPos");
/*    */   }
/*    */   
/*    */   protected boolean a(ahb paramahb, asv paramasv, int paramInt)
/*    */   {
/* 71 */     if (this.d >= 0) {
/* 72 */       return true;
/*    */     }
/*    */     
/* 75 */     int i = 0;
/* 76 */     int j = 0;
/* 77 */     for (int k = this.f.c; k <= this.f.f; k++) {
/* 78 */       for (int m = this.f.a; m <= this.f.d; m++) {
/* 79 */         if (paramasv.b(m, 64, k)) {
/* 80 */           i += Math.max(paramahb.i(m, k), paramahb.t.i());
/* 81 */           j++;
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 86 */     if (j == 0) {
/* 87 */       return false;
/*    */     }
/* 89 */     this.d = (i / j);
/* 90 */     this.f.a(0, this.d - this.f.b + paramInt, 0);
/* 91 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */