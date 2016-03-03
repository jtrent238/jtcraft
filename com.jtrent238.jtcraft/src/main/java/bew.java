/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bew
/*     */   extends bdw
/*     */ {
/*  17 */   private static final bbm[] h = { bbm.a, bbm.b, bbm.A };
/*     */   
/*     */ 
/*     */   private bdw i;
/*     */   
/*  22 */   protected String a = "Controls";
/*     */   private bbj r;
/*  24 */   public bal f = null;
/*     */   public long g;
/*     */   private bes s;
/*     */   private bcb t;
/*     */   
/*     */   public bew(bdw parambdw, bbj parambbj) {
/*  30 */     this.i = parambdw;
/*  31 */     this.r = parambbj;
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/*  36 */     this.s = new bes(this, this.k);
/*  37 */     this.n.add(new bcb(200, this.l / 2 - 155, this.m - 29, 150, 20, brp.a("gui.done", new Object[0])));
/*  38 */     this.n.add(this.t = new bcb(201, this.l / 2 - 155 + 160, this.m - 29, 150, 20, brp.a("controls.resetAll", new Object[0])));
/*  39 */     this.a = brp.a("controls.title", new Object[0]);
/*     */     
/*  41 */     int j = 0;
/*  42 */     for (bbm localbbm : h) {
/*  43 */       if (localbbm.a()) {
/*  44 */         this.n.add(new bcn(localbbm.c(), this.l / 2 - 155 + j % 2 * 160, 18 + 24 * (j >> 1), localbbm));
/*     */       } else {
/*  46 */         this.n.add(new bcj(localbbm.c(), this.l / 2 - 155 + j % 2 * 160, 18 + 24 * (j >> 1), localbbm, this.r.c(localbbm)));
/*     */       }
/*     */       
/*  49 */       j++;
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(bcb parambcb)
/*     */   {
/*  55 */     if (parambcb.k == 200) {
/*  56 */       this.k.a(this.i);
/*  57 */     } else if (parambcb.k == 201) {
/*  58 */       for (bal localbal : this.k.u.as) {
/*  59 */         localbal.b(localbal.h());
/*     */       }
/*  61 */       bal.b();
/*  62 */     } else if ((parambcb.k < 100) && ((parambcb instanceof bcj))) {
/*  63 */       this.r.a(((bcj)parambcb).d(), 1);
/*  64 */       parambcb.j = this.r.c(bbm.a(parambcb.k));
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  70 */     if (this.f != null) {
/*  71 */       this.r.a(this.f, -100 + paramInt3);
/*  72 */       this.f = null;
/*  73 */       bal.b();
/*  74 */     } else if ((paramInt3 != 0) || (!this.s.a(paramInt1, paramInt2, paramInt3))) {
/*  75 */       super.a(paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void b(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  81 */     if ((paramInt3 != 0) || (!this.s.b(paramInt1, paramInt2, paramInt3))) {
/*  82 */       super.b(paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(char paramChar, int paramInt)
/*     */   {
/*  88 */     if (this.f != null) {
/*  89 */       if (paramInt == 1) {
/*  90 */         this.r.a(this.f, 0);
/*     */       } else {
/*  92 */         this.r.a(this.f, paramInt);
/*     */       }
/*     */       
/*  95 */       this.f = null;
/*  96 */       this.g = bao.K();
/*  97 */       bal.b();
/*     */     } else {
/*  99 */       super.a(paramChar, paramInt);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*     */   {
/* 105 */     c();
/*     */     
/* 107 */     this.s.a(paramInt1, paramInt2, paramFloat);
/* 108 */     a(this.q, this.a, this.l / 2, 8, 16777215);
/*     */     
/* 110 */     int j = 1;
/*     */     
/* 112 */     for (bal localbal : this.r.as) {
/* 113 */       if (localbal.i() != localbal.h()) {
/* 114 */         j = 0;
/* 115 */         break;
/*     */       }
/*     */     }
/*     */     
/* 119 */     this.t.l = (j == 0);
/*     */     
/* 121 */     super.a(paramInt1, paramInt2, paramFloat);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */