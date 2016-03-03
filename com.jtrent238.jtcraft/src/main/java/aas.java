/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aas
/*     */   implements rb
/*     */ {
/*     */   private final agm a;
/*  11 */   private add[] b = new add[3];
/*     */   private final yz c;
/*     */   private agn d;
/*     */   private int e;
/*     */   
/*     */   public aas(yz paramyz, agm paramagm) {
/*  17 */     this.c = paramyz;
/*  18 */     this.a = paramagm;
/*     */   }
/*     */   
/*     */   public int a()
/*     */   {
/*  23 */     return this.b.length;
/*     */   }
/*     */   
/*     */   public add a(int paramInt)
/*     */   {
/*  28 */     return this.b[paramInt];
/*     */   }
/*     */   
/*     */   public add a(int paramInt1, int paramInt2)
/*     */   {
/*  33 */     if (this.b[paramInt1] != null) {
/*  34 */       if (paramInt1 == 2) {
/*  35 */         localadd = this.b[paramInt1];
/*  36 */         this.b[paramInt1] = null;
/*  37 */         return localadd;
/*     */       }
/*  39 */       if (this.b[paramInt1].b <= paramInt2) {
/*  40 */         localadd = this.b[paramInt1];
/*  41 */         this.b[paramInt1] = null;
/*  42 */         if (d(paramInt1)) {
/*  43 */           h();
/*     */         }
/*  45 */         return localadd;
/*     */       }
/*  47 */       add localadd = this.b[paramInt1].a(paramInt2);
/*  48 */       if (this.b[paramInt1].b == 0) this.b[paramInt1] = null;
/*  49 */       if (d(paramInt1)) {
/*  50 */         h();
/*     */       }
/*  52 */       return localadd;
/*     */     }
/*     */     
/*  55 */     return null;
/*     */   }
/*     */   
/*     */   private boolean d(int paramInt) {
/*  59 */     return (paramInt == 0) || (paramInt == 1);
/*     */   }
/*     */   
/*     */   public add a_(int paramInt)
/*     */   {
/*  64 */     if (this.b[paramInt] != null) {
/*  65 */       add localadd = this.b[paramInt];
/*  66 */       this.b[paramInt] = null;
/*  67 */       return localadd;
/*     */     }
/*  69 */     return null;
/*     */   }
/*     */   
/*     */   public void a(int paramInt, add paramadd)
/*     */   {
/*  74 */     this.b[paramInt] = paramadd;
/*  75 */     if ((paramadd != null) && (paramadd.b > d())) paramadd.b = d();
/*  76 */     if (d(paramInt)) {
/*  77 */       h();
/*     */     }
/*     */   }
/*     */   
/*     */   public String b()
/*     */   {
/*  83 */     return "mob.villager";
/*     */   }
/*     */   
/*     */   public boolean k_()
/*     */   {
/*  88 */     return false;
/*     */   }
/*     */   
/*     */   public int d()
/*     */   {
/*  93 */     return 64;
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz)
/*     */   {
/*  98 */     return this.a.b() == paramyz;
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
/* 111 */     return true;
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/* 116 */     h();
/*     */   }
/*     */   
/*     */   public void h() {
/* 120 */     this.d = null;
/*     */     
/* 122 */     Object localObject = this.b[0];
/* 123 */     add localadd = this.b[1];
/*     */     
/* 125 */     if (localObject == null) {
/* 126 */       localObject = localadd;
/* 127 */       localadd = null;
/*     */     }
/*     */     
/* 130 */     if (localObject == null) {
/* 131 */       a(2, null);
/*     */     } else {
/* 133 */       ago localago = this.a.b(this.c);
/* 134 */       if (localago != null) {
/* 135 */         agn localagn = localago.a((add)localObject, localadd, this.e);
/* 136 */         if ((localagn != null) && (!localagn.g())) {
/* 137 */           this.d = localagn;
/* 138 */           a(2, localagn.d().m());
/* 139 */         } else if (localadd != null)
/*     */         {
/* 141 */           localagn = localago.a(localadd, (add)localObject, this.e);
/* 142 */           if ((localagn != null) && (!localagn.g())) {
/* 143 */             this.d = localagn;
/* 144 */             a(2, localagn.d().m());
/*     */           } else {
/* 146 */             a(2, null);
/*     */           }
/*     */         }
/*     */         else {
/* 150 */           a(2, null);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 155 */     this.a.a_(a(2));
/*     */   }
/*     */   
/*     */   public agn i() {
/* 159 */     return this.d;
/*     */   }
/*     */   
/*     */   public void c(int paramInt) {
/* 163 */     this.e = paramInt;
/* 164 */     h();
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aas.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */