/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bef
/*    */   extends bdw
/*    */ {
/*    */   private bdw f;
/* 12 */   protected String a = "Video Settings";
/*    */   
/*    */   private bbj g;
/*    */   private bch h;
/* 16 */   private static final bbm[] i = { bbm.m, bbm.f, bbm.n, bbm.j, bbm.h, bbm.g, bbm.o, bbm.i, bbm.d, bbm.p, bbm.q, bbm.x, bbm.y, bbm.F, bbm.G };
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public bef(bdw parambdw, bbj parambbj)
/*    */   {
/* 23 */     this.f = parambdw;
/* 24 */     this.g = parambbj;
/*    */   }
/*    */   
/*    */   public void b()
/*    */   {
/* 29 */     this.a = brp.a("options.videoTitle", new Object[0]);
/* 30 */     this.n.clear();
/*    */     
/* 32 */     this.n.add(new bcb(200, this.l / 2 - 100, this.m - 27, brp.a("gui.done", new Object[0])));
/*    */     
/* 34 */     if (buu.d) {
/* 35 */       this.h = new bck(this.k, this.l, this.m, 32, this.m - 32, 25, i);
/*    */     } else {
/* 37 */       bbm[] arrayOfbbm1 = new bbm[i.length - 1];
/* 38 */       int j = 0;
/* 39 */       for (bbm localbbm : i)
/* 40 */         if (localbbm != bbm.i)
/*    */         {
/*    */ 
/* 43 */           arrayOfbbm1[j] = localbbm;
/* 44 */           j++;
/*    */         }
/* 46 */       this.h = new bck(this.k, this.l, this.m, 32, this.m - 32, 25, arrayOfbbm1);
/*    */     }
/*    */   }
/*    */   
/*    */   protected void a(bcb parambcb)
/*    */   {
/* 52 */     if (!parambcb.l) { return;
/*    */     }
/* 54 */     if (parambcb.k == 200) {
/* 55 */       this.k.u.b();
/* 56 */       this.k.a(this.f);
/*    */     }
/*    */   }
/*    */   
/*    */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 62 */     int j = this.g.aI;
/*    */     
/* 64 */     super.a(paramInt1, paramInt2, paramInt3);
/* 65 */     this.h.a(paramInt1, paramInt2, paramInt3);
/*    */     
/* 67 */     if (this.g.aI != j) {
/* 68 */       bca localbca = new bca(this.k, this.k.d, this.k.e);
/* 69 */       int k = localbca.a();
/* 70 */       int m = localbca.b();
/* 71 */       a(this.k, k, m);
/*    */     }
/*    */   }
/*    */   
/*    */   protected void b(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 77 */     int j = this.g.aI;
/*    */     
/* 79 */     super.b(paramInt1, paramInt2, paramInt3);
/* 80 */     this.h.b(paramInt1, paramInt2, paramInt3);
/*    */     
/* 82 */     if (this.g.aI != j) {
/* 83 */       bca localbca = new bca(this.k, this.k.d, this.k.e);
/* 84 */       int k = localbca.a();
/* 85 */       int m = localbca.b();
/* 86 */       a(this.k, k, m);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*    */   {
/* 92 */     c();
/* 93 */     this.h.a(paramInt1, paramInt2, paramFloat);
/*    */     
/* 95 */     a(this.q, this.a, this.l / 2, 5, 16777215);
/*    */     
/* 97 */     super.a(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */