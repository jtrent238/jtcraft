/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bpf
/*    */   extends bnw
/*    */ {
/*  9 */   private static final bqx o = new bqx("textures/entity/zombie_pigman.png");
/* 10 */   private static final bqx p = new bqx("textures/entity/zombie/zombie.png");
/* 11 */   private static final bqx q = new bqx("textures/entity/zombie/zombie_villager.png");
/*    */   
/*    */   private bhm r;
/*    */   
/*    */   private bil s;
/*    */   protected bhm k;
/*    */   protected bhm l;
/*    */   protected bhm m;
/*    */   protected bhm n;
/* 20 */   private int t = 1;
/*    */   
/*    */   public bpf() {
/* 23 */     super(new bip(), 0.5F, 1.0F);
/* 24 */     this.r = this.a;
/* 25 */     this.s = new bil();
/*    */   }
/*    */   
/*    */   protected void d()
/*    */   {
/* 30 */     this.g = new bip(1.0F, true);
/* 31 */     this.h = new bip(0.5F, true);
/*    */     
/* 33 */     this.k = this.g;
/* 34 */     this.l = this.h;
/*    */     
/* 36 */     this.m = new bil(1.0F, 0.0F, true);
/* 37 */     this.n = new bil(0.5F, 0.0F, true);
/*    */   }
/*    */   
/*    */   protected int a(yq paramyq, int paramInt, float paramFloat)
/*    */   {
/* 42 */     b(paramyq);
/* 43 */     return super.a(paramyq, paramInt, paramFloat);
/*    */   }
/*    */   
/*    */   public void a(yq paramyq, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*    */   {
/* 48 */     b(paramyq);
/* 49 */     super.a(paramyq, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*    */   }
/*    */   
/*    */ 
/*    */   protected bqx a(yq paramyq)
/*    */   {
/* 55 */     if ((paramyq instanceof yh)) {
/* 56 */       return o;
/*    */     }
/*    */     
/* 59 */     if (paramyq.cb()) {
/* 60 */       return q;
/*    */     }
/* 62 */     return p;
/*    */   }
/*    */   
/*    */   protected void a(yq paramyq, float paramFloat)
/*    */   {
/* 67 */     b(paramyq);
/* 68 */     super.a(paramyq, paramFloat);
/*    */   }
/*    */   
/*    */   private void b(yq paramyq) {
/* 72 */     if (paramyq.cb()) {
/* 73 */       if (this.t != this.s.a()) {
/* 74 */         this.s = new bil();
/* 75 */         this.t = this.s.a();
/* 76 */         this.m = new bil(1.0F, 0.0F, true);
/* 77 */         this.n = new bil(0.5F, 0.0F, true);
/*    */       }
/* 79 */       this.i = this.s;
/* 80 */       this.g = this.m;
/* 81 */       this.h = this.n;
/*    */     } else {
/* 83 */       this.i = this.r;
/* 84 */       this.g = this.k;
/* 85 */       this.h = this.l;
/*    */     }
/*    */     
/* 88 */     this.a = ((bhm)this.i);
/*    */   }
/*    */   
/*    */   protected void a(yq paramyq, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 93 */     if (paramyq.cc()) {
/* 94 */       paramFloat2 += (float)(Math.cos(paramyq.aa * 3.25D) * 3.141592653589793D * 0.25D);
/*    */     }
/* 96 */     super.a(paramyq, paramFloat1, paramFloat2, paramFloat3);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bpf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */