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
/*     */ 
/*     */ class bed
/*     */   extends bcb
/*     */ {
/*     */   private final w r;
/*     */   private final String s;
/*  77 */   public float o = 1.0F;
/*     */   public boolean p;
/*     */   
/*     */   public bed(bec parambec, int paramInt1, int paramInt2, int paramInt3, w paramw, boolean paramBoolean) {
/*  81 */     super(paramInt1, paramInt2, paramInt3, paramBoolean ? 310 : 150, 20, "");
/*  82 */     this.r = paramw;
/*  83 */     this.s = brp.a("soundCategory." + paramw.a(), new Object[0]);
/*  84 */     this.j = (this.s + ": " + parambec.a(paramw));
/*  85 */     this.o = bec.a(parambec).a(paramw);
/*     */   }
/*     */   
/*     */   public int a(boolean paramBoolean)
/*     */   {
/*  90 */     return 0;
/*     */   }
/*     */   
/*     */   protected void b(bao parambao, int paramInt1, int paramInt2)
/*     */   {
/*  95 */     if (!this.m) { return;
/*     */     }
/*  97 */     if (this.p) {
/*  98 */       this.o = ((paramInt1 - (this.h + 4)) / (this.f - 8));
/*  99 */       if (this.o < 0.0F) this.o = 0.0F;
/* 100 */       if (this.o > 1.0F) this.o = 1.0F;
/* 101 */       parambao.u.a(this.r, this.o);
/* 102 */       parambao.u.b();
/* 103 */       this.j = (this.s + ": " + this.q.a(this.r));
/*     */     }
/*     */     
/* 106 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 107 */     b(this.h + (int)(this.o * (this.f - 8)), this.i, 0, 66, 4, 20);
/* 108 */     b(this.h + (int)(this.o * (this.f - 8)) + 4, this.i, 196, 66, 4, 20);
/*     */   }
/*     */   
/*     */   public boolean c(bao parambao, int paramInt1, int paramInt2)
/*     */   {
/* 113 */     if (super.c(parambao, paramInt1, paramInt2)) {
/* 114 */       this.o = ((paramInt1 - (this.h + 4)) / (this.f - 8));
/* 115 */       if (this.o < 0.0F) this.o = 0.0F;
/* 116 */       if (this.o > 1.0F) this.o = 1.0F;
/* 117 */       parambao.u.a(this.r, this.o);
/* 118 */       parambao.u.b();
/* 119 */       this.j = (this.s + ": " + this.q.a(this.r));
/* 120 */       this.p = true;
/* 121 */       return true;
/*     */     }
/*     */     
/* 124 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(btp parambtp) {}
/*     */   
/*     */ 
/*     */   public void a(int paramInt1, int paramInt2)
/*     */   {
/* 133 */     if (this.p) {
/* 134 */       float f = this.r == w.a ? 1.0F : bec.a(this.q).a(this.r);
/* 135 */       this.q.k.X().a(bso.a(new bqx("gui.button.press"), 1.0F));
/*     */     }
/* 137 */     this.p = false;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */