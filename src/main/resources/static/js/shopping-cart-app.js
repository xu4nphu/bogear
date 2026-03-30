const { createApp } = Vue;

window.cart = {
    items: [],

    // 1. Thêm sản phẩm (Nhận đủ 4 tham số)
    add(id, name, price, image) {
        let item = this.items.find(item => item.id == id);
        if (item) {
            item.qty++;
        } else {
            this.items.push({ id, name, price, image, qty: 1 });
        }
        this.saveToLocalStorage();
        alert("Đã thêm " + name + " vào giỏ hàng Bo Gear!");
    },

    // 2. Xóa 1 món
    remove(id) {
        let index = this.items.findIndex(item => item.id == id);
        if (index !== -1) {
            this.items.splice(index, 1);
            this.saveToLocalStorage();
        }
    },

    // 3. Reset sạch giỏ hàng
    clear() {
        if (confirm("Phú có chắc muốn xóa sạch toàn bộ giỏ hàng không?")) {
            this.items = [];
            this.saveToLocalStorage();
        }
    },

    // 4. Tính tổng số lượng (Badge Header)
    get count() {
        return this.items.reduce((total, item) => total + item.qty, 0);
    },

    // 5. Tính tổng tiền (Trang View)
    get amount() {
        return this.items.reduce((total, item) => total + (item.qty * item.price), 0);
    },

    // 6. Lưu & Load dữ liệu
    saveToLocalStorage() {
        localStorage.setItem("cart", JSON.stringify(this.items));
    },
    loadFromLocalStorage() {
        let json = localStorage.getItem("cart");
        this.items = json ? JSON.parse(json) : [];
    }
};

createApp({
    data() {
        return { cart: window.cart }
    },
    mounted() {
        this.cart.loadFromLocalStorage();
    }
}).mount('#app');