/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
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
/*     */ public class id
/*     */   extends ft
/*     */ {
/*  21 */   private String a = "";
/*  22 */   private String b = "";
/*  23 */   private String c = "";
/*  24 */   private String d = "";
/*  25 */   private Collection e = new ArrayList();
/*     */   private int f;
/*     */   private int g;
/*     */   
/*     */   public id() {}
/*     */   
/*     */   public id(azy paramazy, int paramInt)
/*     */   {
/*  33 */     this.a = paramazy.b();
/*  34 */     this.f = paramInt;
/*     */     
/*  36 */     if ((paramInt == 0) || (paramInt == 2)) {
/*  37 */       this.b = paramazy.c();
/*  38 */       this.c = paramazy.e();
/*  39 */       this.d = paramazy.f();
/*  40 */       this.g = paramazy.i();
/*     */     }
/*  42 */     if (paramInt == 0) {
/*  43 */       this.e.addAll(paramazy.d());
/*     */     }
/*     */   }
/*     */   
/*     */   public id(azy paramazy, Collection paramCollection, int paramInt) {
/*  48 */     if ((paramInt != 3) && (paramInt != 4)) throw new IllegalArgumentException("Method must be join or leave for player constructor");
/*  49 */     if ((paramCollection == null) || (paramCollection.isEmpty())) { throw new IllegalArgumentException("Players cannot be null/empty");
/*     */     }
/*  51 */     this.f = paramInt;
/*  52 */     this.a = paramazy.b();
/*  53 */     this.e.addAll(paramCollection);
/*     */   }
/*     */   
/*     */   public void a(et paramet)
/*     */   {
/*  58 */     this.a = paramet.c(16);
/*  59 */     this.f = paramet.readByte();
/*     */     
/*  61 */     if ((this.f == 0) || (this.f == 2)) {
/*  62 */       this.b = paramet.c(32);
/*  63 */       this.c = paramet.c(16);
/*  64 */       this.d = paramet.c(16);
/*  65 */       this.g = paramet.readByte();
/*     */     }
/*     */     
/*  68 */     if ((this.f == 0) || (this.f == 3) || (this.f == 4)) {
/*  69 */       int i = paramet.readShort();
/*     */       
/*  71 */       for (int j = 0; j < i; j++) {
/*  72 */         this.e.add(paramet.c(40));
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(et paramet)
/*     */   {
/*  79 */     paramet.a(this.a);
/*  80 */     paramet.writeByte(this.f);
/*     */     
/*  82 */     if ((this.f == 0) || (this.f == 2)) {
/*  83 */       paramet.a(this.b);
/*  84 */       paramet.a(this.c);
/*  85 */       paramet.a(this.d);
/*  86 */       paramet.writeByte(this.g);
/*     */     }
/*     */     
/*  89 */     if ((this.f == 0) || (this.f == 3) || (this.f == 4)) {
/*  90 */       paramet.writeShort(this.e.size());
/*     */       
/*  92 */       for (String str : this.e) {
/*  93 */         paramet.a(str);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(fv paramfv)
/*     */   {
/* 100 */     paramfv.a(this);
/*     */   }
/*     */   
/*     */   public String c() {
/* 104 */     return this.a;
/*     */   }
/*     */   
/*     */   public String d() {
/* 108 */     return this.b;
/*     */   }
/*     */   
/*     */   public String e() {
/* 112 */     return this.c;
/*     */   }
/*     */   
/*     */   public String f() {
/* 116 */     return this.d;
/*     */   }
/*     */   
/*     */   public Collection g() {
/* 120 */     return this.e;
/*     */   }
/*     */   
/*     */   public int h() {
/* 124 */     return this.f;
/*     */   }
/*     */   
/*     */   public int i() {
/* 128 */     return this.g;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\id.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */