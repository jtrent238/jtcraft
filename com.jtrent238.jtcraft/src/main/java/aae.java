/*     */ 
/*     */ 
/*     */ 
/*     */ public class aae
/*     */   implements rb
/*     */ {
/*     */   private add[] a;
/*     */   private int b;
/*     */   private zs c;
/*     */   
/*     */   public aae(zs paramzs, int paramInt1, int paramInt2)
/*     */   {
/*  13 */     int i = paramInt1 * paramInt2;
/*  14 */     this.a = new add[i];
/*  15 */     this.c = paramzs;
/*  16 */     this.b = paramInt1;
/*     */   }
/*     */   
/*     */   public int a()
/*     */   {
/*  21 */     return this.a.length;
/*     */   }
/*     */   
/*     */   public add a(int paramInt)
/*     */   {
/*  26 */     if (paramInt >= a()) {
/*  27 */       return null;
/*     */     }
/*  29 */     return this.a[paramInt];
/*     */   }
/*     */   
/*     */   public add b(int paramInt1, int paramInt2) {
/*  33 */     if ((paramInt1 < 0) || (paramInt1 >= this.b)) {
/*  34 */       return null;
/*     */     }
/*  36 */     int i = paramInt1 + paramInt2 * this.b;
/*  37 */     return a(i);
/*     */   }
/*     */   
/*     */   public String b()
/*     */   {
/*  42 */     return "container.crafting";
/*     */   }
/*     */   
/*     */   public boolean k_()
/*     */   {
/*  47 */     return false;
/*     */   }
/*     */   
/*     */   public add a_(int paramInt)
/*     */   {
/*  52 */     if (this.a[paramInt] != null) {
/*  53 */       add localadd = this.a[paramInt];
/*  54 */       this.a[paramInt] = null;
/*  55 */       return localadd;
/*     */     }
/*  57 */     return null;
/*     */   }
/*     */   
/*     */   public add a(int paramInt1, int paramInt2)
/*     */   {
/*  62 */     if (this.a[paramInt1] != null) {
/*  63 */       if (this.a[paramInt1].b <= paramInt2) {
/*  64 */         localadd = this.a[paramInt1];
/*  65 */         this.a[paramInt1] = null;
/*  66 */         this.c.a(this);
/*  67 */         return localadd;
/*     */       }
/*  69 */       add localadd = this.a[paramInt1].a(paramInt2);
/*  70 */       if (this.a[paramInt1].b == 0) this.a[paramInt1] = null;
/*  71 */       this.c.a(this);
/*  72 */       return localadd;
/*     */     }
/*     */     
/*  75 */     return null;
/*     */   }
/*     */   
/*     */   public void a(int paramInt, add paramadd)
/*     */   {
/*  80 */     this.a[paramInt] = paramadd;
/*  81 */     this.c.a(this);
/*     */   }
/*     */   
/*     */   public int d()
/*     */   {
/*  86 */     return 64;
/*     */   }
/*     */   
/*     */ 
/*     */   public void e() {}
/*     */   
/*     */ 
/*     */   public boolean a(yz paramyz)
/*     */   {
/*  95 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void f() {}
/*     */   
/*     */ 
/*     */   public void l_() {}
/*     */   
/*     */ 
/*     */   public boolean b(int paramInt, add paramadd)
/*     */   {
/* 108 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */