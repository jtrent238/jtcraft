/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.properties.Property;
/*     */ import com.mojang.authlib.properties.PropertyMap;
/*     */ import java.util.List;
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
/*     */ public class gb
/*     */   extends ft
/*     */ {
/*     */   private int a;
/*     */   private GameProfile b;
/*     */   private int c;
/*     */   private int d;
/*     */   private int e;
/*     */   private byte f;
/*     */   private byte g;
/*     */   private int h;
/*     */   private te i;
/*     */   private List j;
/*     */   
/*     */   public gb() {}
/*     */   
/*     */   public gb(yz paramyz)
/*     */   {
/*  36 */     this.a = paramyz.y();
/*  37 */     this.b = paramyz.bJ();
/*  38 */     this.c = qh.c(paramyz.s * 32.0D);
/*  39 */     this.d = qh.c(paramyz.t * 32.0D);
/*  40 */     this.e = qh.c(paramyz.u * 32.0D);
/*  41 */     this.f = ((byte)(int)(paramyz.y * 256.0F / 360.0F));
/*  42 */     this.g = ((byte)(int)(paramyz.z * 256.0F / 360.0F));
/*     */     
/*  44 */     add localadd = paramyz.bm.h();
/*  45 */     this.h = (localadd == null ? 0 : adb.b(localadd.b()));
/*     */     
/*  47 */     this.i = paramyz.z();
/*     */   }
/*     */   
/*     */   public void a(et paramet)
/*     */   {
/*  52 */     this.a = paramet.a();
/*  53 */     UUID localUUID = UUID.fromString(paramet.c(36));
/*  54 */     this.b = new GameProfile(localUUID, paramet.c(16));
/*  55 */     int k = paramet.a();
/*  56 */     for (int m = 0; m < k; m++) {
/*  57 */       String str1 = paramet.c(32767);
/*  58 */       String str2 = paramet.c(32767);
/*  59 */       String str3 = paramet.c(32767);
/*  60 */       this.b.getProperties().put(str1, new Property(str1, str2, str3));
/*     */     }
/*  62 */     this.c = paramet.readInt();
/*  63 */     this.d = paramet.readInt();
/*  64 */     this.e = paramet.readInt();
/*  65 */     this.f = paramet.readByte();
/*  66 */     this.g = paramet.readByte();
/*  67 */     this.h = paramet.readShort();
/*  68 */     this.j = te.b(paramet);
/*     */   }
/*     */   
/*     */   public void b(et paramet)
/*     */   {
/*  73 */     paramet.b(this.a);
/*  74 */     UUID localUUID = this.b.getId();
/*  75 */     paramet.a(localUUID == null ? "" : localUUID.toString());
/*  76 */     paramet.a(this.b.getName());
/*  77 */     paramet.b(this.b.getProperties().size());
/*  78 */     for (Property localProperty : this.b.getProperties().values()) {
/*  79 */       paramet.a(localProperty.getName());
/*  80 */       paramet.a(localProperty.getValue());
/*  81 */       paramet.a(localProperty.getSignature());
/*     */     }
/*  83 */     paramet.writeInt(this.c);
/*  84 */     paramet.writeInt(this.d);
/*  85 */     paramet.writeInt(this.e);
/*  86 */     paramet.writeByte(this.f);
/*  87 */     paramet.writeByte(this.g);
/*  88 */     paramet.writeShort(this.h);
/*  89 */     this.i.a(paramet);
/*     */   }
/*     */   
/*     */   public void a(fv paramfv)
/*     */   {
/*  94 */     paramfv.a(this);
/*     */   }
/*     */   
/*     */   public List c() {
/*  98 */     if (this.j == null) {
/*  99 */       this.j = this.i.c();
/*     */     }
/* 101 */     return this.j;
/*     */   }
/*     */   
/*     */   public String b()
/*     */   {
/* 106 */     return String.format("id=%d, gameProfile='%s', x=%.2f, y=%.2f, z=%.2f, carried=%d", new Object[] { Integer.valueOf(this.a), this.b, Float.valueOf(this.c / 32.0F), Float.valueOf(this.d / 32.0F), Float.valueOf(this.e / 32.0F), Integer.valueOf(this.h) });
/*     */   }
/*     */   
/*     */   public int d() {
/* 110 */     return this.a;
/*     */   }
/*     */   
/*     */   public GameProfile e() {
/* 114 */     return this.b;
/*     */   }
/*     */   
/*     */   public int f() {
/* 118 */     return this.c;
/*     */   }
/*     */   
/*     */   public int g() {
/* 122 */     return this.d;
/*     */   }
/*     */   
/*     */   public int h() {
/* 126 */     return this.e;
/*     */   }
/*     */   
/*     */   public byte i() {
/* 130 */     return this.f;
/*     */   }
/*     */   
/*     */   public byte j() {
/* 134 */     return this.g;
/*     */   }
/*     */   
/*     */   public int k() {
/* 138 */     return this.h;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\gb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */