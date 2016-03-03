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
/*    */ public class bgm
/*    */   extends bdw
/*    */ {
/*    */   private final bdw a;
/*    */   private String f;
/*    */   private bgn g;
/*    */   
/*    */   public bgm(bdw parambdw)
/*    */   {
/* 21 */     this.a = parambdw;
/*    */   }
/*    */   
/*    */   public void b()
/*    */   {
/* 26 */     this.f = brp.a("options.stream.ingest.title", new Object[0]);
/* 27 */     this.g = new bgn(this);
/* 28 */     if (!this.k.Z().z()) { this.k.Z().x();
/*    */     }
/* 30 */     this.n.add(new bcb(1, this.l / 2 - 155, this.m - 24 - 6, 150, 20, brp.a("gui.done", new Object[0])));
/* 31 */     this.n.add(new bcb(2, this.l / 2 + 5, this.m - 24 - 6, 150, 20, brp.a("options.stream.ingest.reset", new Object[0])));
/*    */   }
/*    */   
/*    */   public void m()
/*    */   {
/* 36 */     if (this.k.Z().z()) {
/* 37 */       this.k.Z().y().l();
/*    */     }
/*    */   }
/*    */   
/*    */   protected void a(bcb parambcb)
/*    */   {
/* 43 */     if (!parambcb.l) { return;
/*    */     }
/* 45 */     if (parambcb.k == 1) {
/* 46 */       this.k.a(this.a);
/*    */     } else {
/* 48 */       this.k.u.Q = "";
/* 49 */       this.k.u.b();
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*    */   {
/* 55 */     c();
/* 56 */     this.g.a(paramInt1, paramInt2, paramFloat);
/* 57 */     a(this.q, this.f, this.l / 2, 20, 16777215);
/*    */     
/* 59 */     super.a(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bgm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */