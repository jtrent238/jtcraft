/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class xp
/*     */   extends xl
/*     */   implements rb
/*     */ {
/*  15 */   private add[] a = new add[36];
/*  16 */   private boolean b = true;
/*     */   
/*     */   public xp(ahb paramahb) {
/*  19 */     super(paramahb);
/*     */   }
/*     */   
/*     */   public xp(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3) {
/*  23 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3);
/*     */   }
/*     */   
/*     */   public void a(ro paramro)
/*     */   {
/*  28 */     super.a(paramro);
/*     */     
/*  30 */     for (int i = 0; i < a(); i++) {
/*  31 */       add localadd = a(i);
/*  32 */       if (localadd != null) {
/*  33 */         float f1 = this.Z.nextFloat() * 0.8F + 0.1F;
/*  34 */         float f2 = this.Z.nextFloat() * 0.8F + 0.1F;
/*  35 */         float f3 = this.Z.nextFloat() * 0.8F + 0.1F;
/*     */         
/*  37 */         while (localadd.b > 0) {
/*  38 */           int j = this.Z.nextInt(21) + 10;
/*  39 */           if (j > localadd.b) j = localadd.b;
/*  40 */           localadd.b -= j;
/*     */           
/*  42 */           xk localxk = new xk(this.o, this.s + f1, this.t + f2, this.u + f3, new add(localadd.b(), j, localadd.k()));
/*  43 */           float f4 = 0.05F;
/*  44 */           localxk.v = ((float)this.Z.nextGaussian() * f4);
/*  45 */           localxk.w = ((float)this.Z.nextGaussian() * f4 + 0.2F);
/*  46 */           localxk.x = ((float)this.Z.nextGaussian() * f4);
/*  47 */           this.o.d(localxk);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public add a(int paramInt)
/*     */   {
/*  55 */     return this.a[paramInt];
/*     */   }
/*     */   
/*     */   public add a(int paramInt1, int paramInt2)
/*     */   {
/*  60 */     if (this.a[paramInt1] != null) {
/*  61 */       if (this.a[paramInt1].b <= paramInt2) {
/*  62 */         localadd = this.a[paramInt1];
/*  63 */         this.a[paramInt1] = null;
/*  64 */         return localadd;
/*     */       }
/*  66 */       add localadd = this.a[paramInt1].a(paramInt2);
/*  67 */       if (this.a[paramInt1].b == 0) this.a[paramInt1] = null;
/*  68 */       return localadd;
/*     */     }
/*     */     
/*  71 */     return null;
/*     */   }
/*     */   
/*     */   public add a_(int paramInt)
/*     */   {
/*  76 */     if (this.a[paramInt] != null) {
/*  77 */       add localadd = this.a[paramInt];
/*  78 */       this.a[paramInt] = null;
/*  79 */       return localadd;
/*     */     }
/*  81 */     return null;
/*     */   }
/*     */   
/*     */   public void a(int paramInt, add paramadd)
/*     */   {
/*  86 */     this.a[paramInt] = paramadd;
/*  87 */     if ((paramadd != null) && (paramadd.b > d())) { paramadd.b = d();
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void e() {}
/*     */   
/*     */   public boolean a(yz paramyz)
/*     */   {
/*  96 */     if (this.K) return false;
/*  97 */     if (paramyz.f(this) > 64.0D) return false;
/*  98 */     return true;
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
/*     */   public String b()
/*     */   {
/* 116 */     return k_() ? u() : "container.minecart";
/*     */   }
/*     */   
/*     */   public int d()
/*     */   {
/* 121 */     return 64;
/*     */   }
/*     */   
/*     */   public void b(int paramInt)
/*     */   {
/* 126 */     this.b = false;
/* 127 */     super.b(paramInt);
/*     */   }
/*     */   
/*     */   public void B()
/*     */   {
/* 132 */     if (this.b) {
/* 133 */       for (int i = 0; i < a(); i++) {
/* 134 */         add localadd = a(i);
/* 135 */         if (localadd != null) {
/* 136 */           float f1 = this.Z.nextFloat() * 0.8F + 0.1F;
/* 137 */           float f2 = this.Z.nextFloat() * 0.8F + 0.1F;
/* 138 */           float f3 = this.Z.nextFloat() * 0.8F + 0.1F;
/*     */           
/* 140 */           while (localadd.b > 0) {
/* 141 */             int j = this.Z.nextInt(21) + 10;
/* 142 */             if (j > localadd.b) j = localadd.b;
/* 143 */             localadd.b -= j;
/*     */             
/* 145 */             xk localxk = new xk(this.o, this.s + f1, this.t + f2, this.u + f3, new add(localadd.b(), j, localadd.k()));
/*     */             
/* 147 */             if (localadd.p()) {
/* 148 */               localxk.f().d((dh)localadd.q().b());
/*     */             }
/*     */             
/* 151 */             float f4 = 0.05F;
/* 152 */             localxk.v = ((float)this.Z.nextGaussian() * f4);
/* 153 */             localxk.w = ((float)this.Z.nextGaussian() * f4 + 0.2F);
/* 154 */             localxk.x = ((float)this.Z.nextGaussian() * f4);
/* 155 */             this.o.d(localxk);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 161 */     super.B();
/*     */   }
/*     */   
/*     */   protected void b(dh paramdh)
/*     */   {
/* 166 */     super.b(paramdh);
/*     */     
/* 168 */     dq localdq = new dq();
/*     */     
/* 170 */     for (int i = 0; i < this.a.length; i++) {
/* 171 */       if (this.a[i] != null) {
/* 172 */         dh localdh = new dh();
/* 173 */         localdh.a("Slot", (byte)i);
/* 174 */         this.a[i].b(localdh);
/* 175 */         localdq.a(localdh);
/*     */       }
/*     */     }
/* 178 */     paramdh.a("Items", localdq);
/*     */   }
/*     */   
/*     */ 
/*     */   protected void a(dh paramdh)
/*     */   {
/* 184 */     super.a(paramdh);
/*     */     
/* 186 */     dq localdq = paramdh.c("Items", 10);
/* 187 */     this.a = new add[a()];
/* 188 */     for (int i = 0; i < localdq.c(); i++) {
/* 189 */       dh localdh = localdq.b(i);
/* 190 */       int j = localdh.d("Slot") & 0xFF;
/* 191 */       if ((j >= 0) && (j < this.a.length)) this.a[j] = add.a(localdh);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean c(yz paramyz)
/*     */   {
/* 197 */     if (!this.o.E) {
/* 198 */       paramyz.a(this);
/*     */     }
/*     */     
/* 201 */     return true;
/*     */   }
/*     */   
/*     */   protected void i()
/*     */   {
/* 206 */     int i = 15 - zs.b(this);
/* 207 */     float f = 0.98F + i * 0.001F;
/*     */     
/* 209 */     this.v *= f;
/* 210 */     this.w *= 0.0D;
/* 211 */     this.x *= f;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\xp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */