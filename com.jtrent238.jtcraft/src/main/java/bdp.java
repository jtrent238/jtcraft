/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bdp
/*    */   extends bdw
/*    */ {
/*    */   private int a;
/*    */   private int f;
/*    */   
/*    */   public void b()
/*    */   {
/* 13 */     this.a = 0;
/* 14 */     this.n.clear();
/*    */     
/* 16 */     int i = -16;
/* 17 */     int j = 98;
/* 18 */     this.n.add(new bcb(1, this.l / 2 - 100, this.m / 4 + 120 + i, brp.a("menu.returnToMenu", new Object[0])));
/* 19 */     if (!this.k.F()) {
/* 20 */       ((bcb)this.n.get(0)).j = brp.a("menu.disconnect", new Object[0]);
/*    */     }
/*    */     
/* 23 */     this.n.add(new bcb(4, this.l / 2 - 100, this.m / 4 + 24 + i, brp.a("menu.returnToGame", new Object[0])));
/* 24 */     this.n.add(new bcb(0, this.l / 2 - 100, this.m / 4 + 96 + i, 98, 20, brp.a("menu.options", new Object[0])));
/*    */     bcb localbcb;
/* 26 */     this.n.add(localbcb = new bcb(7, this.l / 2 + 2, this.m / 4 + 96 + i, 98, 20, brp.a("menu.shareToLan", new Object[0])));
/*    */     
/* 28 */     this.n.add(new bcb(5, this.l / 2 - 100, this.m / 4 + 48 + i, 98, 20, brp.a("gui.achievements", new Object[0])));
/* 29 */     this.n.add(new bcb(6, this.l / 2 + 2, this.m / 4 + 48 + i, 98, 20, brp.a("gui.stats", new Object[0])));
/*    */     
/* 31 */     localbcb.l = ((this.k.G()) && (!this.k.H().a()));
/*    */   }
/*    */   
/*    */   protected void a(bcb parambcb)
/*    */   {
/* 36 */     switch (parambcb.k) {
/*    */     case 0: 
/* 38 */       this.k.a(new bdm(this, this.k.u));
/* 39 */       break;
/*    */     
/*    */ 
/*    */     case 1: 
/* 43 */       parambcb.l = false;
/* 44 */       this.k.f.F();
/* 45 */       this.k.a(null);
/* 46 */       this.k.a(new bee());
/* 47 */       break;
/*    */     case 4: 
/* 49 */       this.k.a(null);
/* 50 */       this.k.l();
/* 51 */       break;
/*    */     case 5: 
/* 53 */       this.k.a(new bei(this, this.k.h.m()));
/* 54 */       break;
/*    */     case 6: 
/* 56 */       this.k.a(new bej(this, this.k.h.m()));
/* 57 */       break;
/*    */     case 7: 
/* 59 */       this.k.a(new bdz(this));
/*    */     }
/*    */     
/*    */   }
/*    */   
/*    */   public void e()
/*    */   {
/* 66 */     super.e();
/* 67 */     this.f += 1;
/*    */   }
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*    */   {
/* 72 */     c();
/*    */     
/* 74 */     a(this.q, brp.a("menu.game", new Object[0]), this.l / 2, 40, 16777215);
/*    */     
/* 76 */     super.a(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bdp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */