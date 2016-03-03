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
/*     */ public class zr
/*     */ {
/*     */   private int a;
/*     */   private float b;
/*     */   private float c;
/*     */   private int d;
/*     */   private int e;
/*     */   
/*     */   public zr()
/*     */   {
/*  24 */     this.a = 20;
/*  25 */     this.e = 20;
/*  26 */     this.b = 5.0F;
/*     */   }
/*     */   
/*     */   public void a(int paramInt, float paramFloat) {
/*  30 */     this.a = Math.min(paramInt + this.a, 20);
/*  31 */     this.b = Math.min(this.b + paramInt * paramFloat * 2.0F, this.a);
/*     */   }
/*     */   
/*     */   public void a(acx paramacx, add paramadd) {
/*  35 */     a(paramacx.g(paramadd), paramacx.h(paramadd));
/*     */   }
/*     */   
/*     */   public void a(yz paramyz) {
/*  39 */     rd localrd = paramyz.o.r;
/*     */     
/*  41 */     this.e = this.a;
/*     */     
/*  43 */     if (this.c > 4.0F) {
/*  44 */       this.c -= 4.0F;
/*     */       
/*  46 */       if (this.b > 0.0F) {
/*  47 */         this.b = Math.max(this.b - 1.0F, 0.0F);
/*  48 */       } else if (localrd != rd.a) {
/*  49 */         this.a = Math.max(this.a - 1, 0);
/*     */       }
/*     */     }
/*     */     
/*  53 */     if ((paramyz.o.O().b("naturalRegeneration")) && (this.a >= 18) && (paramyz.bR())) {
/*  54 */       this.d += 1;
/*  55 */       if (this.d >= 80) {
/*  56 */         paramyz.f(1.0F);
/*  57 */         a(3.0F);
/*  58 */         this.d = 0;
/*     */       }
/*  60 */     } else if (this.a <= 0) {
/*  61 */       this.d += 1;
/*  62 */       if (this.d >= 80) {
/*  63 */         if ((paramyz.aS() > 10.0F) || (localrd == rd.d) || ((paramyz.aS() > 1.0F) && (localrd == rd.c))) {
/*  64 */           paramyz.a(ro.f, 1.0F);
/*     */         }
/*  66 */         this.d = 0;
/*     */       }
/*     */     } else {
/*  69 */       this.d = 0;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(dh paramdh)
/*     */   {
/*  76 */     if (paramdh.b("foodLevel", 99)) {
/*  77 */       this.a = paramdh.f("foodLevel");
/*  78 */       this.d = paramdh.f("foodTickTimer");
/*  79 */       this.b = paramdh.h("foodSaturationLevel");
/*  80 */       this.c = paramdh.h("foodExhaustionLevel");
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(dh paramdh) {
/*  85 */     paramdh.a("foodLevel", this.a);
/*  86 */     paramdh.a("foodTickTimer", this.d);
/*  87 */     paramdh.a("foodSaturationLevel", this.b);
/*  88 */     paramdh.a("foodExhaustionLevel", this.c);
/*     */   }
/*     */   
/*     */   public int a() {
/*  92 */     return this.a;
/*     */   }
/*     */   
/*     */   public int b() {
/*  96 */     return this.e;
/*     */   }
/*     */   
/*     */   public boolean c() {
/* 100 */     return this.a < 20;
/*     */   }
/*     */   
/*     */   public void a(float paramFloat) {
/* 104 */     this.c = Math.min(this.c + paramFloat, 40.0F);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public float e()
/*     */   {
/* 112 */     return this.b;
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/* 116 */     this.a = paramInt;
/*     */   }
/*     */   
/*     */   public void b(float paramFloat) {
/* 120 */     this.b = paramFloat;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\zr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */