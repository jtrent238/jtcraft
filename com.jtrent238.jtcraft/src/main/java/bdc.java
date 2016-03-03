/*     */ import java.util.List;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bdc
/*     */   extends bdw
/*     */   implements bcv
/*     */ {
/*     */   private int a;
/*  17 */   private boolean f = false;
/*     */   
/*     */   public void b()
/*     */   {
/*  21 */     this.n.clear();
/*  22 */     if (this.k.f.N().t()) {
/*  23 */       if (this.k.F()) {
/*  24 */         this.n.add(new bcb(1, this.l / 2 - 100, this.m / 4 + 96, brp.a("deathScreen.deleteWorld", new Object[0])));
/*     */       } else {
/*  26 */         this.n.add(new bcb(1, this.l / 2 - 100, this.m / 4 + 96, brp.a("deathScreen.leaveServer", new Object[0])));
/*     */       }
/*     */     } else {
/*  29 */       this.n.add(new bcb(0, this.l / 2 - 100, this.m / 4 + 72, brp.a("deathScreen.respawn", new Object[0])));
/*  30 */       this.n.add(new bcb(1, this.l / 2 - 100, this.m / 4 + 96, brp.a("deathScreen.titleScreen", new Object[0])));
/*     */       
/*  32 */       if (this.k.M() == null) {
/*  33 */         ((bcb)this.n.get(1)).l = false;
/*     */       }
/*     */     }
/*  36 */     for (bcb localbcb : this.n) {
/*  37 */       localbcb.l = false;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   protected void a(char paramChar, int paramInt) {}
/*     */   
/*     */ 
/*     */   protected void a(bcb parambcb)
/*     */   {
/*  47 */     switch (parambcb.k) {
/*     */     case 0: 
/*  49 */       this.k.h.bH();
/*  50 */       this.k.a(null);
/*  51 */       break;
/*     */     case 1: 
/*  53 */       bcw localbcw = new bcw(this, brp.a("deathScreen.quit.confirm", new Object[0]), "", brp.a("deathScreen.titleScreen", new Object[0]), brp.a("deathScreen.respawn", new Object[0]), 0);
/*  54 */       this.k.a(localbcw);
/*  55 */       localbcw.b(20);
/*     */     }
/*     */     
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean, int paramInt)
/*     */   {
/*  62 */     if (paramBoolean) {
/*  63 */       this.k.f.F();
/*  64 */       this.k.a(null);
/*  65 */       this.k.a(new bee());
/*     */     } else {
/*  67 */       this.k.h.bH();
/*  68 */       this.k.a(null);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*     */   {
/*  74 */     a(0, 0, this.l, this.m, 1615855616, -1602211792);
/*     */     
/*  76 */     GL11.glPushMatrix();
/*  77 */     GL11.glScalef(2.0F, 2.0F, 2.0F);
/*     */     
/*  79 */     boolean bool = this.k.f.N().t();
/*     */     
/*  81 */     String str = bool ? brp.a("deathScreen.title.hardcore", new Object[0]) : brp.a("deathScreen.title", new Object[0]);
/*  82 */     a(this.q, str, this.l / 2 / 2, 30, 16777215);
/*     */     
/*  84 */     GL11.glPopMatrix();
/*  85 */     if (bool) {
/*  86 */       a(this.q, brp.a("deathScreen.hardcoreInfo", new Object[0]), this.l / 2, 144, 16777215);
/*     */     }
/*  88 */     a(this.q, brp.a("deathScreen.score", new Object[0]) + ": " + a.o + this.k.h.bD(), this.l / 2, 100, 16777215);
/*     */     
/*  90 */     super.a(paramInt1, paramInt2, paramFloat);
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  95 */     return false;
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/* 100 */     super.e();
/*     */     
/* 102 */     this.a += 1;
/* 103 */     if (this.a == 20) {
/* 104 */       for (bcb localbcb : this.n) {
/* 105 */         localbcb.l = true;
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bdc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */