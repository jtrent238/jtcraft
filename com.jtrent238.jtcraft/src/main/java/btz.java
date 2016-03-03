/*    */ import com.google.common.base.Objects;
/*    */ import com.google.common.base.Objects.ToStringHelper;
/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.gson.Gson;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ public class btz
/*    */ {
/* 10 */   private static final Gson a = new Gson();
/*    */   
/*    */   private final String b;
/*    */   
/*    */   private String c;
/*    */   
/*    */   private Map d;
/*    */   
/*    */   public btz(String paramString1, String paramString2)
/*    */   {
/* 20 */     this.b = paramString1;
/* 21 */     this.c = paramString2;
/*    */   }
/*    */   
/*    */   public btz(String paramString) {
/* 25 */     this(paramString, null);
/*    */   }
/*    */   
/*    */   public void a(String paramString) {
/* 29 */     this.c = paramString;
/*    */   }
/*    */   
/*    */   public String a() {
/* 33 */     return this.c == null ? this.b : this.c;
/*    */   }
/*    */   
/*    */   public void a(String paramString1, String paramString2) {
/* 37 */     if (this.d == null) this.d = Maps.newHashMap();
/* 38 */     if (this.d.size() > 50) throw new IllegalArgumentException("Metadata payload is full, cannot add more to it!");
/* 39 */     if (paramString1 == null) throw new IllegalArgumentException("Metadata payload key cannot be null!");
/* 40 */     if (paramString1.length() > 255) throw new IllegalArgumentException("Metadata payload key is too long!");
/* 41 */     if (paramString2 == null) throw new IllegalArgumentException("Metadata payload value cannot be null!");
/* 42 */     if (paramString2.length() > 255) { throw new IllegalArgumentException("Metadata payload value is too long!");
/*    */     }
/* 44 */     this.d.put(paramString1, paramString2);
/*    */   }
/*    */   
/*    */   public String b() {
/* 48 */     if ((this.d == null) || (this.d.isEmpty())) { return null;
/*    */     }
/* 50 */     return a.toJson(this.d);
/*    */   }
/*    */   
/*    */   public String c() {
/* 54 */     return this.b;
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 59 */     return Objects.toStringHelper(this).add("name", this.b).add("description", this.c).add("data", b()).toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\btz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */