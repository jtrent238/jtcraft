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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bdj
/*    */   extends bdw
/*    */ {
/*    */   protected bdw a;
/*    */   private bdk f;
/*    */   private final bbj g;
/*    */   private final brr h;
/*    */   private bcj i;
/*    */   private bcj r;
/*    */   
/*    */   public bdj(bdw parambdw, bbj parambbj, brr parambrr)
/*    */   {
/* 28 */     this.a = parambdw;
/* 29 */     this.g = parambbj;
/* 30 */     this.h = parambrr;
/*    */   }
/*    */   
/*    */   public void b()
/*    */   {
/* 35 */     int j = 0;
/* 36 */     if (this.i != null) {}
/*    */     
/*    */ 
/* 39 */     this.n.add(this.i = new bcj(100, this.l / 2 - 155, this.m - 38, bbm.H, this.g.c(bbm.H)));
/* 40 */     this.n.add(this.r = new bcj(6, this.l / 2 - 155 + 160, this.m - 38, brp.a("gui.done", new Object[0])));
/*    */     
/*    */ 
/* 43 */     this.f = new bdk(this);
/* 44 */     this.f.d(7, 8);
/*    */   }
/*    */   
/*    */   protected void a(bcb parambcb)
/*    */   {
/* 49 */     if (!parambcb.l) { return;
/*    */     }
/* 51 */     switch (parambcb.k) {
/*    */     case 100: 
/* 53 */       if ((parambcb instanceof bcj)) {
/* 54 */         this.g.a(((bcj)parambcb).d(), 1);
/* 55 */         parambcb.j = this.g.c(bbm.H);
/*    */         
/* 57 */         bca localbca = new bca(this.k, this.k.d, this.k.e);
/* 58 */         int j = localbca.a();
/* 59 */         int k = localbca.b();
/* 60 */         a(this.k, j, k); }
/* 61 */       break;
/*    */     case 5: 
/*    */       break;
/*    */     
/*    */     case 6: 
/* 66 */       this.k.a(this.a);
/* 67 */       break;
/*    */     default: 
/* 69 */       this.f.a(parambcb);
/*    */     }
/*    */     
/*    */   }
/*    */   
/*    */ 
/*    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*    */   {
/* 77 */     this.f.a(paramInt1, paramInt2, paramFloat);
/*    */     
/* 79 */     a(this.q, brp.a("options.language", new Object[0]), this.l / 2, 16, 16777215);
/* 80 */     a(this.q, "(" + brp.a("options.languageWarning", new Object[0]) + ")", this.l / 2, this.m - 56, 8421504);
/*    */     
/* 82 */     super.a(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bdj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */