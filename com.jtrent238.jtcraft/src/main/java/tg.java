/*     */ import java.util.Random;
/*     */ import java.util.UUID;
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
/*     */ public abstract class tg
/*     */   extends wf
/*     */   implements ta
/*     */ {
/*  20 */   protected vh bp = new vh(this);
/*     */   
/*     */   public tg(ahb paramahb) {
/*  23 */     super(paramahb);
/*     */   }
/*     */   
/*     */   protected void c()
/*     */   {
/*  28 */     super.c();
/*  29 */     this.af.a(16, Byte.valueOf((byte)0));
/*  30 */     this.af.a(17, "");
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/*  35 */     super.b(paramdh);
/*  36 */     if (b() == null) {
/*  37 */       paramdh.a("OwnerUUID", "");
/*     */     } else {
/*  39 */       paramdh.a("OwnerUUID", b());
/*     */     }
/*  41 */     paramdh.a("Sitting", ca());
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/*  46 */     super.a(paramdh);
/*  47 */     String str1 = "";
/*  48 */     if (paramdh.b("OwnerUUID", 8)) {
/*  49 */       str1 = paramdh.j("OwnerUUID");
/*     */     } else {
/*  51 */       String str2 = paramdh.j("Owner");
/*  52 */       str1 = nz.a(str2);
/*     */     }
/*  54 */     if (str1.length() > 0) {
/*  55 */       b(str1);
/*  56 */       j(true);
/*     */     }
/*  58 */     this.bp.a(paramdh.n("Sitting"));
/*  59 */     k(paramdh.n("Sitting"));
/*     */   }
/*     */   
/*     */   protected void i(boolean paramBoolean) {
/*  63 */     String str = "heart";
/*  64 */     if (!paramBoolean) {
/*  65 */       str = "smoke";
/*     */     }
/*  67 */     for (int i = 0; i < 7; i++) {
/*  68 */       double d1 = this.Z.nextGaussian() * 0.02D;
/*  69 */       double d2 = this.Z.nextGaussian() * 0.02D;
/*  70 */       double d3 = this.Z.nextGaussian() * 0.02D;
/*  71 */       this.o.a(str, this.s + this.Z.nextFloat() * this.M * 2.0F - this.M, this.t + 0.5D + this.Z.nextFloat() * this.N, this.u + this.Z.nextFloat() * this.M * 2.0F - this.M, d1, d2, d3);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(byte paramByte)
/*     */   {
/*  77 */     if (paramByte == 7) {
/*  78 */       i(true);
/*  79 */     } else if (paramByte == 6) {
/*  80 */       i(false);
/*     */     } else {
/*  82 */       super.a(paramByte);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean bZ() {
/*  87 */     return (this.af.a(16) & 0x4) != 0;
/*     */   }
/*     */   
/*     */   public void j(boolean paramBoolean) {
/*  91 */     int i = this.af.a(16);
/*  92 */     if (paramBoolean) {
/*  93 */       this.af.b(16, Byte.valueOf((byte)(i | 0x4)));
/*     */     } else {
/*  95 */       this.af.b(16, Byte.valueOf((byte)(i & 0xFFFFFFFB)));
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean ca() {
/* 100 */     return (this.af.a(16) & 0x1) != 0;
/*     */   }
/*     */   
/*     */   public void k(boolean paramBoolean) {
/* 104 */     int i = this.af.a(16);
/* 105 */     if (paramBoolean) {
/* 106 */       this.af.b(16, Byte.valueOf((byte)(i | 0x1)));
/*     */     } else {
/* 108 */       this.af.b(16, Byte.valueOf((byte)(i & 0xFFFFFFFE)));
/*     */     }
/*     */   }
/*     */   
/*     */   public String b()
/*     */   {
/* 114 */     return this.af.e(17);
/*     */   }
/*     */   
/*     */   public void b(String paramString) {
/* 118 */     this.af.b(17, paramString);
/*     */   }
/*     */   
/*     */   public sv cb()
/*     */   {
/*     */     try {
/* 124 */       UUID localUUID = UUID.fromString(b());
/* 125 */       if (localUUID == null) {
/* 126 */         return null;
/*     */       }
/* 128 */       return this.o.a(localUUID);
/*     */     } catch (IllegalArgumentException localIllegalArgumentException) {}
/* 130 */     return null;
/*     */   }
/*     */   
/*     */   public boolean e(sv paramsv)
/*     */   {
/* 135 */     return paramsv == cb();
/*     */   }
/*     */   
/*     */   public vh cc() {
/* 139 */     return this.bp;
/*     */   }
/*     */   
/*     */   public boolean a(sv paramsv1, sv paramsv2) {
/* 143 */     return true;
/*     */   }
/*     */   
/*     */   public bae bt()
/*     */   {
/* 148 */     if (bZ()) {
/* 149 */       sv localsv = cb();
/* 150 */       if (localsv != null) {
/* 151 */         return localsv.bt();
/*     */       }
/*     */     }
/* 154 */     return super.bt();
/*     */   }
/*     */   
/*     */   public boolean c(sv paramsv)
/*     */   {
/* 159 */     if (bZ()) {
/* 160 */       sv localsv = cb();
/* 161 */       if (paramsv == localsv) {
/* 162 */         return true;
/*     */       }
/* 164 */       if (localsv != null) {
/* 165 */         return localsv.c(paramsv);
/*     */       }
/*     */     }
/* 168 */     return super.c(paramsv);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\tg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */